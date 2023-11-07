package com.flightmanagementsystem.serviceimpl;

import java.time.LocalDate;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.dto.FlightDTO;
import com.flightmanagementsystem.entity.Flight;
import com.flightmanagementsystem.entity.Schedule;
import com.flightmanagementsystem.repository.FlightRepository;
import com.flightmanagementsystem.repository.ScheduleRepository;
import com.flightmanagementsystem.service.IFlightService;

@Service
public class IFlightServiceImpl implements IFlightService {

	@Autowired
	FlightRepository flightRepository;

	@Autowired
	IScheduleServiceImpl service;

	@Override
	public Flight addFlight(Flight flight) {

		return flightRepository.save(flight);
	}

	@Override
	public Flight viewByFlightId(Integer flightId) {

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
	public List<Flight> viewBySourceDestination(String source, String destination) {

		return flightRepository.findAll().stream().filter(e -> hasMatchingSourceDestination(e, source, destination))
				.collect(Collectors.toList());

	}

	private boolean hasMatchingSourceDestination(Flight flight, String source, String destination) {
		for (Schedule schedule : flight.getSchedules()) {
			if (schedule.getSourceAirport().getAirportCity().equals(source)
					&& schedule.getDestinationAirport().getAirportCity().equals(destination)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Flight> viewByDepartureDate(LocalDate date) {

		return flightRepository.findAll().stream().filter(e -> hasMatchingDepartureDate(e, date))
				.collect(Collectors.toList());
	}

	private boolean hasMatchingDepartureDate(Flight flight, LocalDate date) {
		for (Schedule schedule : flight.getSchedules()) {
			if (schedule.getDepartureDate().toLocalDate().isEqual(date)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Flight> viewBySourceDestinationAndDepartureDate(String source, String destination,
			LocalDate departureDate) {
		return flightRepository.findAll().stream()
				.filter(e -> hasMatchingSourceDestinationAndDepartureDate(e, source, destination, departureDate))
				.collect(Collectors.toList());
	}

	private boolean hasMatchingSourceDestinationAndDepartureDate(Flight flight, String source, String destination,
			LocalDate departureDate) {
		for (Schedule schedule : flight.getSchedules()) {
			if (schedule.getSourceAirport().getAirportCity().equals(source)
					&& schedule.getDestinationAirport().getAirportCity().equals(destination)
					&& schedule.getDepartureDate().toLocalDate().isEqual(departureDate)) {
				return true;
			}
		}
		return false;
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

}
