package com.flightmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
<<<<<<< HEAD
@Table(name="Customer")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {

	@Id
	protected Long userId;
	protected String userName;
	protected String password;
	protected String email;
	protected Long mobileNumber;
	protected String userRole;
=======
@Table(name="User")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User{
	@Id
	private Long userId;
	private String userName;
	private String password;
	private String email;
	private Long mobileNumber;
	private String userRole;
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
}