package com.flightmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerDTO extends UserDTO {
	
	private Long passengerUIN;
	private String passengerName;
	private Integer age;
	
	

}
