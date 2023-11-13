package com.flightmanagementsystem.serviceimpl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Booking;
import com.flightmanagementsystem.entity.Passenger;
<<<<<<< HEAD
import com.flightmanagementsystem.exception.BookingManagementException;
=======
import com.flightmanagementsystem.exception.BookingNotFoundException;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
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
	public String cancelBooking(Integer bookingid) throws BookingManagementException {
		if(bookingRepository.findById(bookingid).isEmpty()) {
			throw new BookingManagementException("Booking does not exist.");
=======
	public String cancelBooking(Integer bookingid) throws BookingNotFoundException {
		if(bookingRepository.findById(bookingid).isEmpty()) {
			throw new BookingNotFoundException("Booking does not exist.");
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		}else
		bookingRepository.deleteById(bookingid);
		return "Booking cancelled";
	}

	@Override
	public List<Booking> viewBookings() {

		return bookingRepository.findAll();
	}

	@Override
<<<<<<< HEAD
	public List<Booking> viewBookingByPassengerId(Long passengerId) throws BookingManagementException {
		List<Booking> bookingList= bookingRepository.findAll().stream().filter(e -> hasMatchingPassenger(e, passengerId))
				.collect(Collectors.toList());
		if(bookingList.size()==0) {
			throw new BookingManagementException("No booking for given passenger Id");
		}else 
		return bookingList;
			
=======
	public List<Booking> viewBookingByPassengerId(Long passengerId) throws BookingNotFoundException {
		List<Booking> bookingList= bookingRepository.findAll().stream().filter(e -> hasMatchingPassenger(e, passengerId))
				.collect(Collectors.toList());
		if(bookingList.size()==0) {
			throw new BookingNotFoundException("No booking for given passenger Id");
		}else 
			return bookingList;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
	}

	//Method to check for matching passenger for given ID
	private boolean hasMatchingPassenger(Booking booking, Long passengerId) {
<<<<<<< HEAD
		
		for (Passenger passenger : booking.getPassengerList()) {
			if (passenger.getPassengerUIN().equals(passengerId)) {
=======
		for (Passenger passenger : booking.getPassengerList()) {
			if (passenger.getPassengerUIN() == passengerId) {
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
				return true;
			}
		}
		return false;
	}

	@Override
<<<<<<< HEAD
	public Booking viewBookingByBookingId(Integer bookingid) throws BookingManagementException {

		if(!bookingRepository.existsById(bookingid)) {
			throw new BookingManagementException("Booking does not exist for given BookingId.");
=======
	public Booking viewBookingByBookingId(Integer bookingid) throws BookingNotFoundException {

		if(!bookingRepository.existsById(bookingid)) {
			throw new BookingNotFoundException("Booking does not exist for given BookingId.");
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		}else
		return bookingRepository.findById(bookingid).get();
	}

	@Override
<<<<<<< HEAD
	public List<Booking> viewBookingByDate(LocalDate bookingdate) throws BookingManagementException {
		List<Booking> bookingList= bookingRepository.findAll().stream().filter(e -> e.getBookingDate().isEqual(bookingdate))
				.collect(Collectors.toList());
		if(bookingList.size()==0) {
			throw new BookingManagementException("No booking available for given bookingDate.");
=======
	public List<Booking> viewBookingByDate(LocalDate bookingdate) throws BookingNotFoundException {
		List<Booking> bookingList= bookingRepository.findAll().stream().filter(e -> e.getBookingDate().isEqual(bookingdate))
				.collect(Collectors.toList());
		if(bookingList.size()==0) {
			throw new BookingNotFoundException("No booking available for given bookingDate");
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		}else
			return bookingList;
	}

	@Override
<<<<<<< HEAD
	public List<Booking> viewBookingsByFlightId(Integer flightid) throws BookingManagementException {
		List<Booking> bookingList=bookingRepository.findAll().stream().filter(e -> e.getFlight().getFlightId() == flightid)
				.collect(Collectors.toList());
		if(bookingList.size()==0) {
			throw new BookingManagementException("No booking available for given flight.");
=======
	public List<Booking> viewBookingsByFlightId(Integer flightid) throws BookingNotFoundException {
		List<Booking> bookingList=bookingRepository.findAll().stream().filter(e -> e.getFlight().getFlightId() == flightid)
				.collect(Collectors.toList());
		if(bookingList.size()==0) {
			throw new BookingNotFoundException("No booking available for given bookingDate");
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		}else 
			return bookingList;
	}

	@Override
	public Booking updateBooking(Booking booking) {
		Booking object = new Booking();
		object.setBookingId(booking.getBookingId());
		object.setBookingDate(booking.getBookingDate());
		object.setPassengerList(booking.getPassengerList());
		object.setTotalCost(booking.getTotalCost());
		object.setFlight(booking.getFlight());
		bookingRepository.save(object);
		return object;
	}
<<<<<<< HEAD
	
	
=======
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
}
