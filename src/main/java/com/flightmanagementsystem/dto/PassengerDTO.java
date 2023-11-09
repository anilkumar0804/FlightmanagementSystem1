package com.flightmanagementsystem.dto;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerDTO extends UserDTO {
	
=======
import lombok.Data;

@Data
public class PassengerDTO extends UserDTO {

>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	private Long passengerUIN;
	private String passengerName;
	private Integer age;
	
	

}
