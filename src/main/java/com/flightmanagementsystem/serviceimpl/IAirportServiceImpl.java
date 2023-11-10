package com.flightmanagementsystem.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Airport;
import com.flightmanagementsystem.exception.AirportManagementException;
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
	}

	@Override
	public Airport updateAirportDetails(Airport airport) {

		Airport updateAirport = new Airport();
		updateAirport.setAirportId(airport.getAirportId());
		updateAirport.setAirportName(airport.getAirportName());
		updateAirport.setAirportCity(airport.getAirportCity());
		updateAirport.setAirportCountry(airport.getAirportCountry());

		airportRepository.save(updateAirport);
		return updateAirport;
	}

}
