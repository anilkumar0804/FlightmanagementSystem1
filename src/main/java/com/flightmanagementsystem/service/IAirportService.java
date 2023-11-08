package com.flightmanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Airport;

@Service
public interface IAirportService {

	public String addAirportDetails(Airport airport);

	public List<Airport> viewAirports();

	public List<Airport> viewByCountry(String country);

	public List<Airport> viewByCity(String city);

	public List<Airport> viewByAirportName(String airportName);

	public Airport updateAirportDetails(Airport airport);

}
