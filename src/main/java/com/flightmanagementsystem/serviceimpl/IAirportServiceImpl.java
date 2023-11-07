package com.flightmanagementsystem.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Airport;
import com.flightmanagementsystem.repository.AirportRepository;
import com.flightmanagementsystem.service.IAirportService;

@Service
public class IAirportServiceImpl implements IAirportService {
	
	@Autowired
	AirportRepository airportRepository;

	@Override
	public String addAirportDetails(Airport airport) {
		airportRepository.save(airport);
		return "Airport added.";
	}

	@Override
	public List<Airport> viewAirports() {
	
		return airportRepository.findAll();
	}

	@Override
	public List<Airport> viewByCountry(String country) {
		
		return airportRepository.findAll().stream().filter(e->e.getAirportCountry().equals(country)).collect(Collectors.toList());
	}

	@Override
	public List<Airport> viewByCity(String city) {
		
		return airportRepository.findAll().stream().filter(e->e.getAirportCity().equals(city)).collect(Collectors.toList());
	}

	@Override
	public List<Airport> viewByAirportName(String airportName) {
		
		return airportRepository.findAll().stream().filter(e->e.getAirportName().equals(airportName)).collect(Collectors.toList());
	}

	@Override
	public Airport updateAirportDetails(Airport airport) {
		
		Airport updateAirport= new Airport();
		updateAirport.setAirportid(airport.getAirportid());
		updateAirport.setAirportName(airport.getAirportName());
		updateAirport.setAirportCity(airport.getAirportCity());
		updateAirport.setAirportCountry(airport.getAirportCountry());
		
		airportRepository.save(updateAirport);
		return updateAirport;
	}



}
