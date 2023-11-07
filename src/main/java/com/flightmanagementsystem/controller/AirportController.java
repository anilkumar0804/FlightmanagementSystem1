package com.flightmanagementsystem.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.flightmanagementsystem.entity.Airport;
import com.flightmanagementsystem.serviceimpl.IAirportServiceImpl;



@RestController
@RequestMapping("/airport")
public class AirportController {
	@Autowired
	IAirportServiceImpl service;
	
	@PostMapping("/")
	public String addAirport(@RequestBody Airport airport) {
		return service.addAirportDetails(airport);
	}
	@GetMapping("/airports")
	public List<Airport> getAllAirport(){
		return service.viewAirports();
	}
	@GetMapping("/bycountry/{country}")
	public List<Airport> getByCountry(@PathVariable("country") String country){
		return service.viewByCountry(country);
	}
	@GetMapping("/bycity/{city}")
	public List<Airport> getByCity(@PathVariable("city") String city){
		return service.viewByCity(city);
	}
	@GetMapping("/byname/{airportname}")
	public List<Airport> getByAirportName(@PathVariable("airportname") String airportName){
		return service.viewByAirportName(airportName);
	}
	@PutMapping("/update")
	public Airport updateAirport(@RequestBody Airport airport) {
		return service.updateAirportDetails(airport);
	}

}
