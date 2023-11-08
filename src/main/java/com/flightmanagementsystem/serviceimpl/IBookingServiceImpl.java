package com.flightmanagementsystem.serviceimpl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Booking;
import com.flightmanagementsystem.entity.Passenger;
import com.flightmanagementsystem.repository.BookingRepository;
import com.flightmanagementsystem.service.IBookingService;

@Service
public class IBookingServiceImpl implements IBookingService {

	@Autowired
	BookingRepository bookingRepository;

	@Override
	public String addBooking(Booking booking) {
		bookingRepository.save(booking);

		return "Booking successfull";
	}

	@Override
	public String cancelBooking(Integer bookingid) {
		bookingRepository.deleteById(bookingid);
		return "Booking cancelled";
	}

	@Override
	public List<Booking> viewBookings() {

		return bookingRepository.findAll();
	}

	@Override
	public List<Booking> viewBookingByPassengerId(Long passengerId) {

		return bookingRepository.findAll().stream().filter(e -> hasMatchingPassenger(e, passengerId))
				.collect(Collectors.toList());
	}

	private boolean hasMatchingPassenger(Booking booking, Long passengerId) {
		for (Passenger passenger : booking.getPassengerList()) {
			if (passenger.getPassengerUIN() == passengerId) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Booking viewBookingByBookingId(Integer bookingid) {

		return bookingRepository.findById(bookingid).get();
	}

	@Override
	public List<Booking> viewBookingByDate(LocalDate bookingdate) {

		return bookingRepository.findAll().stream().filter(e -> e.getBookingDate().isEqual(bookingdate))
				.collect(Collectors.toList());
	}

	@Override
	public List<Booking> viewBookingsByFlightId(Integer flightid) {

		return bookingRepository.findAll().stream().filter(e -> e.getFlight().getFlightId() == flightid)
				.collect(Collectors.toList());
	}

	@Override
	public Booking updateBooking(Booking booking) {
		Booking object = new Booking();
		object.setBookingId(booking.getBookingId());
//		object.setPassenger(booking.getPassenger());
		object.setBookingDate(booking.getBookingDate());
		object.setPassengerList(booking.getPassengerList());
		object.setTotalCost(booking.getTotalCost());
		object.setFlight(booking.getFlight());
		bookingRepository.save(object);
		return object;
	}
}
