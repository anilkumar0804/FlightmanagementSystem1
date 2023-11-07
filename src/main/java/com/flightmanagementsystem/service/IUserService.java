package com.flightmanagementsystem.service;

import com.flightmanagementsystem.dto.UserDTO;

public interface IUserService {
	UserDTO registerUser(UserDTO user);

	UserDTO signIn(String userName, String password);
	
	public String signOut();

}
