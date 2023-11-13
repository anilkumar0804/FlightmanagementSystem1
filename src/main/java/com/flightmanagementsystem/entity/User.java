package com.flightmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
<<<<<<< HEAD
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
=======
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Customer")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {

	@Id
	protected Long userId;
<<<<<<< HEAD
	@NotBlank(message = "Username must not be null")
	private String userName;
	@NotBlank(message = "Password must not be null")
	protected String password;
	@Email
	protected String email;
	@NotNull(message = "Mobile number must not be null")
	protected Long mobileNumber;
	@NotBlank(message = "User role must not be null")
=======
	protected String userName;
	protected String password;
	protected String email;
	protected Long mobileNumber;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
	protected String userRole;
}