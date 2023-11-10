package com.flightmanagementsystem.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public UserDTO registerUser(User user) {
		
		
			UserDTO object = toUserDto(user);

			userRepository.save(user);

			return object;
	}

	@Override
	public UserDTO signIn(String userName, String password) throws UserManagementException {
		if (userRepository.findByUserName(userName) == null) {
			throw new UserManagementException("Invalid Username");
		}

		User user = userRepository.findByUserName(userName);

		if (!user.getPassword().equals(password)) {
			throw new UserManagementException("Invalid password");
		} else {
			UserDTO userdto = toUserDto(user);
			return userdto;
		}
	}

	@Override
	public List<UserDTO> viewAllUsers() {
		return userRepository.findAll().stream().map(e -> toUserDto(e)).collect(Collectors.toList());
	}
	
	@Override
	public String deleteUser(Long userId) throws UserManagementException {
		if(!userRepository.existsById(userId)) {
			throw new UserManagementException("User does not exist.");
		}else
			userRepository.deleteById(userId);
		
		return "User deleted.";
	}

	@Override
	public String signOut() {

		return "You have been logged out.";
	}
	

	// method to convert user to userDTO
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
