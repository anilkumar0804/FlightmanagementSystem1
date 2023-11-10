package com.flightmanagementsystem.service;

import java.util.List;

import com.flightmanagementsystem.dto.UserDTO;
import com.flightmanagementsystem.entity.User;
import com.flightmanagementsystem.exception.UserManagementException;

public interface IUserService {
	UserDTO registerUser(User user) ;

	UserDTO signIn(String userName, String password) throws UserManagementException;
	
	List<UserDTO> viewAllUsers();
	
	String deleteUser(Long userId) throws UserManagementException;
	
	String signOut();

}
