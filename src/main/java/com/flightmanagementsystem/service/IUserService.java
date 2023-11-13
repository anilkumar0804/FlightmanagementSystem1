package com.flightmanagementsystem.service;

<<<<<<< HEAD
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
=======
import com.flightmanagementsystem.dto.UserDTO;
import com.flightmanagementsystem.entity.User;

public interface IUserService {
	UserDTO registerUser(User user);

	UserDTO signIn(String userName, String password);
	
	public String signOut();
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

}
