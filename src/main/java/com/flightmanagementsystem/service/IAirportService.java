package com.flightmanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Airport;
import com.flightmanagementsystem.exception.AirportManagementException;

@Service
public interface IAirportService {

	public String addAirportDetails(Airport airport);

	public List<Airport> viewAirports();

	public List<Airport> viewByCountry(String country) throws AirportManagementException;

	public List<Airport> viewByCity(String city) throws AirportManagementException;

	public List<Airport> viewByAirportName(String airportName) throws AirportManagementException;

	public Airport updateAirportDetails(Airport airport);

}
