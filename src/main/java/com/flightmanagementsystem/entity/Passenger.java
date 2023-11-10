package com.flightmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Passenger")

public class Passenger extends User {

	
	private Long passengerUIN;
	private String passengerName;
	private Integer age;
	
	
	
}
