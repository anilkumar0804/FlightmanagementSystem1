package com.flightmanagementsystem.service;

import java.time.LocalDate;
import java.util.List;

import com.flightmanagementsystem.entity.Flight;
import com.flightmanagementsystem.exception.FlightManagementException;

public interface IFlightService {

	public String addFlight(Flight flight);

	public Flight viewByFlightId(Integer flightId) throws FlightManagementException;

	public List<Flight> viewAllFlights();

	public List<Flight> viewByFlightName();

	public List<Flight> viewByFlightSeatCapacity();

<<<<<<< HEAD
	public List<Flight> viewBySourceDestination(String source, String destination) throws FlightManagementException;

	public List<Flight> viewByDepartureDate(LocalDate date) throws FlightManagementException;

	public List<Flight> viewBySourceDestinationAndDepartureDate(String source, String destination,
			LocalDate departureDate) throws FlightManagementException;
=======
	public List<Flight> viewBySourceDestination(String source, String destination);

	public List<Flight> viewByDepartureDate(LocalDate date);

	public List<Flight> viewBySourceDestinationAndDepartureDate(String source, String destination,
			LocalDate departureDate);
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

	public Flight updateFlight(Flight flight);

}
