package com.flightmanagementsystem.dto;

import lombok.Data;

@Data
public class PassengerDTO extends UserDTO {

	private Long passengerUIN;
	private String passengerName;
	private Integer age;
	
	

}
