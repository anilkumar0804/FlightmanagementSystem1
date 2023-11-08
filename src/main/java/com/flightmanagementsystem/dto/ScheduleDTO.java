package com.flightmanagementsystem.dto;

import java.time.LocalDate;

import lombok.Data;


@Data
public class ScheduleDTO {
	
	private Integer scheduleId;
	private AirportDTO sourceAirport;
	private AirportDTO destinationAirport;
	private LocalDate arrivalDate;
	private LocalDate departureDate;

}
