package com.flightmanagementsystem.dto;

<<<<<<< HEAD
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
=======
import lombok.Data;

@Data
public class UserDTO {
	
	private Long userId;
	private String userName;
	private String email;
	private String userRole;
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d

}
