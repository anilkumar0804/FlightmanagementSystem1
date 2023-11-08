package com.flightmanagementsystem.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightmanagementsystem.entity.Flight;
import com.flightmanagementsystem.serviceimpl.IFlightServiceImpl;

@RestController
@RequestMapping("/flight")
public class FlightController {

	@Autowired
	IFlightServiceImpl service;
	
	@PostMapping("/")
	public String addFlight(@RequestBody Flight flight) {
		return service.addFlight(flight);
	}
	@GetMapping("/byid/{id}")
	public Flight getByFlightId(@PathVariable("id") int flightId) {
		return service.viewByFlightId(flightId);
	}
	@GetMapping("/flights")
	public List<Flight> getAllFlights(){
		return service.viewAllFlights();
	}
	@GetMapping("/byname")
	public List<Flight> getByFlightName(){
		return service.viewByFlightName();
	}
	@GetMapping("/byseat")
	public List<Flight> getByFlightSeatCapacity(){
		return service.viewByFlightSeatCapacity();
	}
	@GetMapping("/bysrcdest/{source}/{destination}")
	public List<Flight> getBySourceDestination(@PathVariable("source") String source, @PathVariable("destination") String destination){
		return service.viewBySourceDestination(source, destination);
	}
	@GetMapping("/bysrcdest/{source}/{destination}/{date}")
	public List<Flight> getBySourceDestinationDate(@PathVariable("source") String source, @PathVariable("destination") String destination, 
			@PathVariable("date") LocalDate date){
		return service.viewBySourceDestinationAndDepartureDate(source, destination,date);
	}
	@PutMapping("/update")
	public Flight updateFlight(@RequestBody Flight flight) {
		return service.updateFlight(flight);
	}
}
