package com.flightmanagementsystem.serviceimpl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Booking;
import com.flightmanagementsystem.entity.Passenger;
<<<<<<< HEAD
import com.flightmanagementsystem.exception.BookingNotFoundException;
=======
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
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
<<<<<<< HEAD
	public String cancelBooking(Integer bookingid) throws BookingNotFoundException {
		if(bookingRepository.findById(bookingid).isEmpty()) {
			throw new BookingNotFoundException("Booking does not exist.");
		}else
=======
	public String cancelBooking(Integer bookingid) {
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
		bookingRepository.deleteById(bookingid);
		return "Booking cancelled";
	}

	@Override
	public List<Booking> viewBookings() {

		return bookingRepository.findAll();
	}

	@Override
<<<<<<< HEAD
	public List<Booking> viewBookingByPassengerId(Long passengerId) throws BookingNotFoundException {
		List<Booking> bookingList= bookingRepository.findAll().stream().filter(e -> hasMatchingPassenger(e, passengerId))
				.collect(Collectors.toList());
		if(bookingList.size()==0) {
			throw new BookingNotFoundException("No booking for given passenger Id");
		}else 
			return bookingList;
	}

	//Method to check for matching passenger for given ID
=======
	public List<Booking> viewBookingByPassengerId(Long passengerId) {

		return bookingRepository.findAll().stream().filter(e -> hasMatchingPassenger(e, passengerId))
				.collect(Collectors.toList());
	}

>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	private boolean hasMatchingPassenger(Booking booking, Long passengerId) {
		for (Passenger passenger : booking.getPassengerList()) {
			if (passenger.getPassengerUIN() == passengerId) {
				return true;
			}
		}
		return false;
	}

	@Override
<<<<<<< HEAD
	public Booking viewBookingByBookingId(Integer bookingid) throws BookingNotFoundException {

		if(!bookingRepository.existsById(bookingid)) {
			throw new BookingNotFoundException("Booking does not exist for given BookingId.");
		}else
=======
	public Booking viewBookingByBookingId(Integer bookingid) {

>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
		return bookingRepository.findById(bookingid).get();
	}

	@Override
<<<<<<< HEAD
	public List<Booking> viewBookingByDate(LocalDate bookingdate) throws BookingNotFoundException {
		List<Booking> bookingList= bookingRepository.findAll().stream().filter(e -> e.getBookingDate().isEqual(bookingdate))
				.collect(Collectors.toList());
		if(bookingList.size()==0) {
			throw new BookingNotFoundException("No booking available for given bookingDate");
		}else
			return bookingList;
	}

	@Override
	public List<Booking> viewBookingsByFlightId(Integer flightid) throws BookingNotFoundException {
		List<Booking> bookingList=bookingRepository.findAll().stream().filter(e -> e.getFlight().getFlightId() == flightid)
				.collect(Collectors.toList());
		if(bookingList.size()==0) {
			throw new BookingNotFoundException("No booking available for given bookingDate");
		}else 
			return bookingList;
=======
	public List<Booking> viewBookingByDate(LocalDate bookingdate) {

		return bookingRepository.findAll().stream().filter(e -> e.getBookingDate().isEqual(bookingdate))
				.collect(Collectors.toList());
	}

	@Override
	public List<Booking> viewBookingsByFlightId(Integer flightid) {

		return bookingRepository.findAll().stream().filter(e -> e.getFlight().getFlightId() == flightid)
				.collect(Collectors.toList());
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	}

	@Override
	public Booking updateBooking(Booking booking) {
		Booking object = new Booking();
		object.setBookingId(booking.getBookingId());
<<<<<<< HEAD
=======
//		object.setPassenger(booking.getPassenger());
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
		object.setBookingDate(booking.getBookingDate());
		object.setPassengerList(booking.getPassengerList());
		object.setTotalCost(booking.getTotalCost());
		object.setFlight(booking.getFlight());
		bookingRepository.save(object);
		return object;
	}
}
