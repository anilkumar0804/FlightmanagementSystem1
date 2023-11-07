package com.flightmanagementsystem.repository;

import java.time.LocalDate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightmanagementsystem.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Integer>{
//	public Flight addFlight(Flight flight);
// 
//	public Flight viewByFlightId(Integer flightId);
// 
//	public List<Flight> viewAllFlights();
// 
//	public List<Flight> viewByFlightName();
// 
//	public List<Flight> viewByFlightSeatCapacity();
// 
//	public List<Flight> viewBySourceDestination(String source, String destination);
// 
//	public List<Flight> viewByDepartureDate(LocalDate date);
// 
//	public List<Flight> viewBySourceDestinationAndDepartureDate(String source, String destination,
//			LocalDate departureDate);
// 
//	public Flight updateFlight(Flight flight); 
}
