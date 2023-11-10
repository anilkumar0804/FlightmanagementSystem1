package com.flightmanagementsystem.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightmanagementsystem.dto.PassengerDTO;
import com.flightmanagementsystem.entity.Booking;
import com.flightmanagementsystem.entity.Passenger;
import com.flightmanagementsystem.exception.BookingManagementException;
import com.flightmanagementsystem.service.IPassengerService;
import com.flightmanagementsystem.serviceimpl.IBookingServiceImpl;
import com.flightmanagementsystem.serviceimpl.IPassengerServiceImpl;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	IBookingServiceImpl service;
	

	@PostMapping("/")
	public String addBooking(@RequestBody Booking booking) {
		return service.addBooking(booking);
	}

	@DeleteMapping("/delete")
	public String deleteBooking(@RequestBody Integer bookingId) throws BookingManagementException {
		return service.cancelBooking(bookingId);
	}

	@GetMapping("/viewbookings")
	public List<Booking> viewBookings() {
		return service.viewBookings();
	}

	@GetMapping("/bypassengerid/{passengerid}")
	public List<Booking> getBookingByPassengerId(@PathVariable("passengerid") Long passengerId) throws BookingManagementException {
		
		return service.viewBookingByPassengerId(passengerId);
	}

	@GetMapping("/bybookingid/{bookingid}")
	public Booking viewBookingByBookingId(@PathVariable("bookingid") Integer bookingId) throws BookingManagementException {
		
		return service.viewBookingByBookingId(bookingId);

	}

	@GetMapping("/bydate/{bookingdate}")
	public List<Booking> viewBookingByDate(@PathVariable("bookingdate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate bookingDate) throws BookingManagementException {
		return service.viewBookingByDate(bookingDate);
	}

	@GetMapping("/byflight/{flightid}")
	public List<Booking> viewBookingsByFlightId(@PathVariable("flightid") Integer flightid) throws BookingManagementException {
		return service.viewBookingsByFlightId(flightid);
	}

	@PutMapping("/update")
	public Booking updateBooking(@RequestBody Booking booking) {
		return service.updateBooking(booking);
	}
}
