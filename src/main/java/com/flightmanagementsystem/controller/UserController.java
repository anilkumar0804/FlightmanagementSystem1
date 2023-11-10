package com.flightmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightmanagementsystem.dto.UserDTO;
import com.flightmanagementsystem.entity.User;
import com.flightmanagementsystem.exception.UserManagementException;
import com.flightmanagementsystem.serviceimpl.IUserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	IUserServiceImpl service;

	@PostMapping("/signup")
	public UserDTO signUp(@RequestBody User user)  {
		return service.registerUser(user);
	}

	@GetMapping("/signin/{username}/{password}")
	public UserDTO logIn(@PathVariable("username") String userName, @PathVariable("password") String password)
			throws UserManagementException {
		return service.signIn(userName, password);
	}

	@GetMapping("/allusers")
	public List<UserDTO> getAllUsers() {
		return service.viewAllUsers();
	}
	@DeleteMapping("/delete/{userid}")
	public String deleteUser(@PathVariable("userid") Long userId) throws UserManagementException {
		return service.deleteUser(userId);
	}

	@GetMapping("/signout")
	public String logOut() {
		return service.signOut();
	}
}
