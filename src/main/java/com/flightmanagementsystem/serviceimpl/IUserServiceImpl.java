package com.flightmanagementsystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.flightmanagementsystem.dto.PassengerDTO;
import com.flightmanagementsystem.dto.UserDTO;
import com.flightmanagementsystem.entity.User;
import com.flightmanagementsystem.exception.UserManagementException;
=======
import com.flightmanagementsystem.dto.UserDTO;
import com.flightmanagementsystem.entity.User;
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
import com.flightmanagementsystem.repository.UserRepository;
import com.flightmanagementsystem.service.IUserService;

@Service
public class IUserServiceImpl implements IUserService {
<<<<<<< HEAD

=======
	
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	@Autowired
	UserRepository userRepository;

	@Override
<<<<<<< HEAD
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
=======
	public UserDTO registerUser(User user) {
		UserDTO object= new UserDTO();
		object.setUserId(user.getUserId());
		object.setEmail(user.getEmail());
		object.setUserName(user.getUserName());
		object.setUserRole(user.getUserRole());
		
		userRepository.save(user);
		
		return object;
	}

	@Override
	public UserDTO signIn(String userName, String password) {
		User user= userRepository.findByUserName(userName);
		UserDTO userDto= new UserDTO();
		if(user.getPassword().equals(password)) {
		userDto.setUserId(user.getUserId());
		userDto.setUserName(user.getUserName());
		userDto.setEmail(user.getEmail());
		userDto.setUserRole(user.getUserRole());
		return userDto;
		}
		return null;
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	}

	@Override
	public String signOut() {
<<<<<<< HEAD

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
=======
		
		return "You have been logged out.";
	}

	
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d

}
