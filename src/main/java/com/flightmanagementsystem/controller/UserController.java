package com.flightmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightmanagementsystem.dto.UserDTO;
import com.flightmanagementsystem.entity.User;
import com.flightmanagementsystem.serviceimpl.IUserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	IUserServiceImpl service;

	@PostMapping("/")
	public UserDTO signUp(@RequestBody User user) {
		return service.registerUser(user);
	}

	@GetMapping("/signin/{username}/{password}")
	public UserDTO logIn(@PathVariable("username") String userName, @PathVariable("password") String password) {
		return service.signIn(userName, password);
	}

	@GetMapping("/signout")
	public String logOut() {
		return service.signOut();
	}
}
