package com.flightmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Passenger")

public class Passenger extends User {

	@NotNull(message = "Passenger UIN must not be null")
	private Long passengerUIN;
	@NotBlank(message = "Passenger name must not be null")
	private String passengerName;
	@NotNull(message = "Age must not be null")
	@Min(value = 1,message = "Age should be minimum 1")
	@Max(value=150,message = "Age should be less than human age")
	private Integer age;
	
	
	
}
