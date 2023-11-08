package com.flightmanagementsystem.service;

import com.flightmanagementsystem.dto.UserDTO;
import com.flightmanagementsystem.entity.User;

public interface IUserService {
	UserDTO registerUser(User user);

	UserDTO signIn(String userName, String password);
	
	public String signOut();

}
