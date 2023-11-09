package com.flightmanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Airport;
<<<<<<< HEAD
import com.flightmanagementsystem.exception.AirportManagementException;
=======
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d

@Service
public interface IAirportService {

	public String addAirportDetails(Airport airport);

	public List<Airport> viewAirports();

<<<<<<< HEAD
	public List<Airport> viewByCountry(String country) throws AirportManagementException;

	public List<Airport> viewByCity(String city) throws AirportManagementException;

	public List<Airport> viewByAirportName(String airportName) throws AirportManagementException;
=======
	public List<Airport> viewByCountry(String country);

	public List<Airport> viewByCity(String city);

	public List<Airport> viewByAirportName(String airportName);
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d

	public Airport updateAirportDetails(Airport airport);

}
