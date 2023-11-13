package com.flightmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
	@NotBlank(message = "Username must not be null")
	private String userName;
	@NotBlank(message = "Password must not be null")
	protected String password;
	@Email
	protected String email;
	@NotNull(message = "Mobile number must not be null")
	protected Long mobileNumber;
	@NotBlank(message = "User role must not be null")
	protected String userRole;
}