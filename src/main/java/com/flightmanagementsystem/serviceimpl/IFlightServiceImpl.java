package com.flightmanagementsystem.serviceimpl;

import java.time.LocalDate;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flightmanagementsystem.dto.FlightDTO;
import com.flightmanagementsystem.service.IFlightService;

@Service
public class IFlightServiceImpl implements IFlightService {

	@Override
	public FlightDTO addFlight(FlightDTO flight) {
		
		return null;
	}

	@Override
	public FlightDTO viewByFlightId(Integer flightId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FlightDTO> viewAllFlights() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FlightDTO> viewByFlightName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FlightDTO> viewByFlightSeatCapacity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FlightDTO> viewBySourceDestination(String source, String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FlightDTO> viewByDepartureDate(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FlightDTO> viewBySourceDestinationAndDepartureDate(String source, String destination,
			LocalDate departureDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlightDTO updateFlight(FlightDTO flight) {
		// TODO Auto-generated method stub
		return null;
	}

}
