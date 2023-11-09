package com.flightmanagementsystem.dto;

import java.util.List;

import lombok.Data;

@Data
public class FlightDTO {
	
	private Integer flightId;
	private String flightName;
	private Integer seatCapacity;
	private Double fare;
	private List<ScheduleDTO> schedules;
}
