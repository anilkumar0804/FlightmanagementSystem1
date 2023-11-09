package com.flightmanagementsystem.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Airport;
<<<<<<< HEAD
import com.flightmanagementsystem.exception.AirportManagementException;
=======
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
import com.flightmanagementsystem.repository.AirportRepository;
import com.flightmanagementsystem.service.IAirportService;

@Service
public class IAirportServiceImpl implements IAirportService {
<<<<<<< HEAD

=======
	
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	@Autowired
	AirportRepository airportRepository;

	@Override
	public String addAirportDetails(Airport airport) {
		airportRepository.save(airport);
		return "Airport added.";
	}

	@Override
	public List<Airport> viewAirports() {
<<<<<<< HEAD

=======
	
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
		return airportRepository.findAll();
	}

	@Override
<<<<<<< HEAD
	public List<Airport> viewByCountry(String country) throws AirportManagementException {

		List<Airport> airportList = airportRepository.findAll().stream()
				.filter(e -> e.getAirportCountry().equals(country)).collect(Collectors.toList());
		if (airportList.size() == 0) {
			throw new AirportManagementException("No airport available in given country.");
		} else
			return airportList;

	}

	@Override
	public List<Airport> viewByCity(String city) throws AirportManagementException {

		List<Airport> airportList = airportRepository.findAll().stream().filter(e -> e.getAirportCity().equals(city))
				.collect(Collectors.toList());
		if (airportList.size() == 0) {
			throw new AirportManagementException("No airport available in given city.");
		} else
			return airportList;
	}

	@Override
	public List<Airport> viewByAirportName(String airportName) throws AirportManagementException {

		List<Airport> airportList = airportRepository.findAll().stream()
				.filter(e -> e.getAirportName().equals(airportName)).collect(Collectors.toList());
		if (airportList.size() == 0) {
			throw new AirportManagementException("No airport available for given airport name.");
		} else
			return airportList;
=======
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
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	}

	@Override
	public Airport updateAirportDetails(Airport airport) {
<<<<<<< HEAD

		Airport updateAirport = new Airport();
		updateAirport.setAirportId(airport.getAirportId());
		updateAirport.setAirportName(airport.getAirportName());
		updateAirport.setAirportCity(airport.getAirportCity());
		updateAirport.setAirportCountry(airport.getAirportCountry());

=======
		
		Airport updateAirport= new Airport();
		updateAirport.setAirportid(airport.getAirportid());
		updateAirport.setAirportName(airport.getAirportName());
		updateAirport.setAirportCity(airport.getAirportCity());
		updateAirport.setAirportCountry(airport.getAirportCountry());
		
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
		airportRepository.save(updateAirport);
		return updateAirport;
	}

<<<<<<< HEAD
=======


>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
}
