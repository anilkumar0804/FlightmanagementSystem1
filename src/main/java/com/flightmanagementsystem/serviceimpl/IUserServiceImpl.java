package com.flightmanagementsystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.dto.PassengerDTO;
import com.flightmanagementsystem.dto.UserDTO;
import com.flightmanagementsystem.entity.User;
import com.flightmanagementsystem.exception.UserManagementException;
import com.flightmanagementsystem.repository.UserRepository;
import com.flightmanagementsystem.service.IUserService;

@Service
public class IUserServiceImpl implements IUserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDTO registerUser(User user) throws UserManagementException {
		if(userRepository.save(user)==null) {throw new UserManagementException("Invlaid user");}
		
		else{UserDTO object = toUserDto(user);

		userRepository.save(user);

		return object;}
	}

	@Override
	public UserDTO signIn(String userName, String password) throws UserManagementException {
		if(userRepository.findByUserName(userName)==null) {
			throw new UserManagementException("Invalid User");
		}
		 
		User user = userRepository.findByUserName(userName);
		
		if (!user.getPassword().equals(password)) {
			throw new UserManagementException("Invlaid password");
		}
		else{
			UserDTO userdto=toUserDto(user);
			return userdto;
		}
	}

	@Override
	public String signOut() {

		return "You have been logged out.";
	}

	//method to convert user to userDTO
	private UserDTO toUserDto(User user) {
		UserDTO object = new UserDTO();
		object.setUserId(user.getUserId());
		object.setEmail(user.getEmail());
		object.setMobileNumber(user.getMobileNumber());
		object.setUserName(user.getUserName());
		object.setUserRole(user.getUserRole());

		return object;
	}

}
