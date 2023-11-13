package com.flightmanagementsystem.controller;

<<<<<<< HEAD
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
=======
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightmanagementsystem.dto.UserDTO;
import com.flightmanagementsystem.entity.User;
<<<<<<< HEAD
import com.flightmanagementsystem.exception.UserManagementException;
=======
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
import com.flightmanagementsystem.serviceimpl.IUserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	IUserServiceImpl service;

<<<<<<< HEAD
	@PostMapping("/signup")
	public UserDTO signUp(@Valid @RequestBody User user)  {
=======
	@PostMapping("/")
	public UserDTO signUp(@RequestBody User user) {
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		return service.registerUser(user);
	}

	@GetMapping("/signin/{username}/{password}")
<<<<<<< HEAD
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

=======
	public UserDTO logIn(@PathVariable("username") String userName, @PathVariable("password") String password) {
		return service.signIn(userName, password);
	}

>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
	@GetMapping("/signout")
	public String logOut() {
		return service.signOut();
	}
}
