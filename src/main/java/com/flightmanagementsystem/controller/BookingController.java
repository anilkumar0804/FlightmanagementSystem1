package com.flightmanagementsystem.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.format.annotation.DateTimeFormat;
=======
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightmanagementsystem.entity.Booking;
<<<<<<< HEAD
import com.flightmanagementsystem.exception.BookingManagementException;
=======
import com.flightmanagementsystem.exception.BookingNotFoundException;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
import com.flightmanagementsystem.serviceimpl.IBookingServiceImpl;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	IBookingServiceImpl service;
<<<<<<< HEAD
	
=======
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

	@PostMapping("/")
	public String addBooking(@RequestBody Booking booking) {
		return service.addBooking(booking);
	}

<<<<<<< HEAD
	@DeleteMapping("/delete/{bookingid}")
	public String deleteBooking(@PathVariable("bookingid") Integer bookingId) throws BookingManagementException {
=======
	@DeleteMapping("/delete")
	public String deleteBooking(@RequestBody Integer bookingId) throws BookingNotFoundException {
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		return service.cancelBooking(bookingId);
	}

	@GetMapping("/viewbookings")
	public List<Booking> viewBookings() {
		return service.viewBookings();
	}

	@GetMapping("/bypassengerid/{passengerid}")
<<<<<<< HEAD
	public List<Booking> getBookingByPassengerId(@PathVariable("passengerid") Long passengerId) throws BookingManagementException {
		
=======
	public List<Booking> getBookingByPassengerId(@PathVariable("passengerid") Long passengerId) throws BookingNotFoundException {
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		return service.viewBookingByPassengerId(passengerId);
	}

	@GetMapping("/bybookingid/{bookingid}")
<<<<<<< HEAD
	public Booking viewBookingByBookingId(@PathVariable("bookingid") Integer bookingId) throws BookingManagementException {
		
		return service.viewBookingByBookingId(bookingId);

	}

	@GetMapping("/bydate/{bookingdate}")
	public List<Booking> viewBookingByDate(@PathVariable("bookingdate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate bookingDate) throws BookingManagementException {
=======
	public Booking viewBookingByBookingId(@PathVariable("bookingId") Integer bookingId) throws BookingNotFoundException {
		return service.viewBookingByBookingId(bookingId);
	}

	@GetMapping("/bydate/{bookingdate}")
	public List<Booking> viewBookingByDate(@PathVariable("bookingdate") LocalDate bookingDate) throws BookingNotFoundException {
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		return service.viewBookingByDate(bookingDate);
	}

	@GetMapping("/byflight/{flightid}")
<<<<<<< HEAD
	public List<Booking> viewBookingsByFlightId(@PathVariable("flightid") Integer flightid) throws BookingManagementException {
=======
	public List<Booking> viewBookingsByFlightId(@PathVariable("flightid") Integer flightid) throws BookingNotFoundException {
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		return service.viewBookingsByFlightId(flightid);
	}

	@PutMapping("/update")
	public Booking updateBooking(@RequestBody Booking booking) {
		return service.updateBooking(booking);
	}
}
