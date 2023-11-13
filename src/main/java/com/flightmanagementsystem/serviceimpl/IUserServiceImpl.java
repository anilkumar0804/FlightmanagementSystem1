package com.flightmanagementsystem.serviceimpl;

<<<<<<< HEAD
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.dto.PassengerDTO;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
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
<<<<<<< HEAD
	public UserDTO registerUser(User user) {
		
		
			UserDTO object = toUserDto(user);

			userRepository.save(user);

			return object;
=======
	public UserDTO registerUser(User user) throws UserManagementException {
		if(userRepository.save(user)==null) {throw new UserManagementException("Invlaid user");}
		
		else{UserDTO object = toUserDto(user);

		userRepository.save(user);

		return object;}
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
	}

	@Override
	public UserDTO signIn(String userName, String password) throws UserManagementException {
<<<<<<< HEAD
		if (userRepository.findByUserName(userName) == null) {
			throw new UserManagementException("Invalid Username");
		}

		User user = userRepository.findByUserName(userName);

		if (!user.getPassword().equals(password)) {
			throw new UserManagementException("Invalid password");
		} else {
			UserDTO userdto = toUserDto(user);
=======
		if(userRepository.findByUserName(userName)==null) {
			throw new UserManagementException("Invalid User");
		}
		 
		User user = userRepository.findByUserName(userName);
		
		if (!user.getPassword().equals(password)) {
			throw new UserManagementException("Invlaid password");
		}
		else{
			UserDTO userdto=toUserDto(user);
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
			return userdto;
		}
	}

	@Override
<<<<<<< HEAD
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
=======
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
	public String signOut() {

		return "You have been logged out.";
	}
<<<<<<< HEAD
	

	// method to convert user to userDTO
=======

	//method to convert user to userDTO
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
	private UserDTO toUserDto(User user) {
		UserDTO object = new UserDTO();
		object.setUserId(user.getUserId());
		object.setEmail(user.getEmail());
		object.setMobileNumber(user.getMobileNumber());
		object.setUserName(user.getUserName());
		object.setUserRole(user.getUserRole());

		return object;
	}

<<<<<<< HEAD
	

=======
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
}
