package com.flightmanagementsystem.service;

import java.time.LocalDate;
import java.util.List;

import com.flightmanagementsystem.entity.Flight;
<<<<<<< HEAD
import com.flightmanagementsystem.exception.FlightManagementException;
=======
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d

public interface IFlightService {

	public String addFlight(Flight flight);

<<<<<<< HEAD
	public Flight viewByFlightId(Integer flightId) throws FlightManagementException;
=======
	public Flight viewByFlightId(Integer flightId);
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d

	public List<Flight> viewAllFlights();

	public List<Flight> viewByFlightName();

	public List<Flight> viewByFlightSeatCapacity();

	public List<Flight> viewBySourceDestination(String source, String destination);

	public List<Flight> viewByDepartureDate(LocalDate date);

	public List<Flight> viewBySourceDestinationAndDepartureDate(String source, String destination,
			LocalDate departureDate);

	public Flight updateFlight(Flight flight);

}
