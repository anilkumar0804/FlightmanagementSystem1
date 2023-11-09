package com.flightmanagementsystem.controller;

import java.util.List;

<<<<<<< HEAD
=======

>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import com.flightmanagementsystem.entity.Airport;
import com.flightmanagementsystem.exception.AirportManagementException;
import com.flightmanagementsystem.serviceimpl.IAirportServiceImpl;

=======

import com.flightmanagementsystem.entity.Airport;
import com.flightmanagementsystem.serviceimpl.IAirportServiceImpl;



>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
@RestController
@RequestMapping("/airport")
public class AirportController {
	@Autowired
	IAirportServiceImpl service;
<<<<<<< HEAD

=======
	
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	@PostMapping("/")
	public String addAirport(@RequestBody Airport airport) {
		return service.addAirportDetails(airport);
	}
<<<<<<< HEAD

	@GetMapping("/airports")
	public List<Airport> getAllAirport() {
		return service.viewAirports();
	}

	@GetMapping("/bycountry/{country}")
	public List<Airport> getByCountry(@PathVariable("country") String country) throws AirportManagementException {
		return service.viewByCountry(country);
	}

	@GetMapping("/bycity/{city}")
	public List<Airport> getByCity(@PathVariable("city") String city) throws AirportManagementException {
		return service.viewByCity(city);
	}

	@GetMapping("/byname/{airportname}")
	public List<Airport> getByAirportName(@PathVariable("airportname") String airportName)
			throws AirportManagementException {
		return service.viewByAirportName(airportName);
	}

=======
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
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	@PutMapping("/update")
	public Airport updateAirport(@RequestBody Airport airport) {
		return service.updateAirportDetails(airport);
	}

}
