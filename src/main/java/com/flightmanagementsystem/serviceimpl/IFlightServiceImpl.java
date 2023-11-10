package com.flightmanagementsystem.serviceimpl;

import java.time.LocalDate;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Flight;
import com.flightmanagementsystem.entity.Schedule;
import com.flightmanagementsystem.exception.FlightManagementException;
import com.flightmanagementsystem.repository.FlightRepository;
import com.flightmanagementsystem.service.IFlightService;

@Service
public class IFlightServiceImpl implements IFlightService {

	@Autowired
	FlightRepository flightRepository;

	@Override
	public String addFlight(Flight flight) {

		flightRepository.save(flight);
		return "Flight addded successfully";
	}

	@Override
	public Flight viewByFlightId(Integer flightId) throws FlightManagementException {

		if (flightRepository.existsById(flightId) == false) {
			throw new FlightManagementException("Flight does not exist");
		} else
			return flightRepository.findById(flightId).get();
	}

	@Override
	public List<Flight> viewAllFlights() {

		return flightRepository.findAll();
	}

	@Override
	public List<Flight> viewByFlightName() {

		return flightRepository.findAll().stream().sorted((a, b) -> a.getFlightName().compareTo(b.getFlightName()))
				.collect(Collectors.toList());
	}

	@Override
	public List<Flight> viewByFlightSeatCapacity() {

		return flightRepository.findAll().stream()
				.sorted((a, b) -> Integer.compare(a.getSeatCapacity(), b.getSeatCapacity()))
				.collect(Collectors.toList());
	}

	@Override
	public List<Flight> viewBySourceDestination(String source, String destination) throws FlightManagementException {

		List<Flight> flightList = flightRepository.findAll().stream()
				.filter(e -> hasMatchingSourceDestination(e, source, destination)).collect(Collectors.toList());
		if (flightList.size() == 0) {
			throw new FlightManagementException("No flights for given source and destination.");
		} else
			return flightList;

	}

	@Override
	public List<Flight> viewByDepartureDate(LocalDate date) throws FlightManagementException {

		List<Flight> flightList = flightRepository.findAll().stream().filter(e -> hasMatchingDepartureDate(e, date))
				.collect(Collectors.toList());
		if (flightList.size() == 0) {
			throw new FlightManagementException("No flights available for given date.");
		} else
			return flightList;
	}

	@Override
	public List<Flight> viewBySourceDestinationAndDepartureDate(String source, String destination,
			LocalDate departureDate) throws FlightManagementException {

		List<Flight> sourceDestinationList = viewBySourceDestination(source, destination);

		List<Flight> departureDateList = sourceDestinationList.stream()
				.filter(e -> hasMatchingDepartureDate(e, departureDate)).collect(Collectors.toList());
		if (departureDateList.size() == 0) {
			throw new FlightManagementException("No flights for given departure date. Please change departure date.");
		} else
			return departureDateList;
	}

	@Override
	public Flight updateFlight(Flight flight) {
		Flight fly = new Flight();
		fly.setFlightId(flight.getFlightId());
		fly.setFlightName(flight.getFlightName());
		fly.setSeatCapacity(flight.getSeatCapacity());
		fly.setFare(flight.getFare());
		fly.setSchedules(flight.getSchedules());
		flightRepository.save(flight);
		return flight;
	}

	// method to check for matching source and destination of a flight
	private boolean hasMatchingSourceDestination(Flight flight, String source, String destination) {
		for (Schedule schedule : flight.getSchedules()) {
			if (schedule.getSourceAirport().getAirportCity().equals(source)
					&& schedule.getDestinationAirport().getAirportCity().equals(destination)) {
				return true;
			}
		}
		return false;
	}

	// method to check for matching departure date of a flight
	private boolean hasMatchingDepartureDate(Flight flight, LocalDate departureDate) {
		for (Schedule schedule : flight.getSchedules()) {
			if (schedule.getDepartureDate().toLocalDate().isEqual(departureDate)) {
				return true;
			}
		}
		return false;
	}

}
