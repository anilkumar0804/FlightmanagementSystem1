package com.flightmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="User")
public class User{
	private Long userId;
	private String userName;
	private String password;
	private String email;
	private Long mobileNumber;
	private String userRole;
}