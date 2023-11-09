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

	public List<Flight> viewBySourceDestination(String source, String destination);

	public List<Flight> viewByDepartureDate(LocalDate date);

	public List<Flight> viewBySourceDestinationAndDepartureDate(String source, String destination,
			LocalDate departureDate);

	public Flight updateFlight(Flight flight);

}
