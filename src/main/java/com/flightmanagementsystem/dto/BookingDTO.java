package com.flightmanagementsystem.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class BookingDTO {

	private Integer bookingId;
	private PassengerDTO passenger;
	private LocalDate bookingDate;
	private List<PassengerDTO> passengerList;
	private Double totalCost;
	private FlightDTO flight;
	private Integer noOfPassengers;

}
