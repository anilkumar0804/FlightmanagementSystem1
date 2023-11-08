package com.flightmanagementsystem.dto;

import lombok.Data;

@Data
public class UserDTO {
	
	private Long userId;
	private String userName;
	private String email;
	private String userRole;

}
