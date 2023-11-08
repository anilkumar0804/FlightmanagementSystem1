package com.flightmanagementsystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.dto.UserDTO;
import com.flightmanagementsystem.entity.User;
import com.flightmanagementsystem.repository.UserRepository;
import com.flightmanagementsystem.service.IUserService;

@Service
public class IUserServiceImpl implements IUserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
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
	}

	@Override
	public String signOut() {
		
		return "You have been logged out.";
	}

	

}
