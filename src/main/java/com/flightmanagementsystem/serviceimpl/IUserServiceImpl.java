package com.flightmanagementsystem.serviceimpl;

import org.springframework.stereotype.Service;

import com.flightmanagementsystem.dto.UserDTO;
import com.flightmanagementsystem.service.IUserService;

@Service
public class IUserServiceImpl implements IUserService {

	@Override
	public UserDTO registerUser(UserDTO user) {
		
		return null;
	}

	@Override
	public UserDTO signIn(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String signOut() {
		// TODO Auto-generated method stub
		return null;
	}

}
