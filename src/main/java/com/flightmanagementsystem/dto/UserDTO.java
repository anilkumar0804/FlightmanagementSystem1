package com.flightmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	
	protected Long userId;
	protected String userName;
	protected String email;
	protected Long mobileNumber;
	protected String userRole;

}
