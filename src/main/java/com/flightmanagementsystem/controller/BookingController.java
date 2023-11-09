package com.flightmanagementsystem.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.flightmanagementsystem.exception.BookingNotFoundException;
=======
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
import com.flightmanagementsystem.serviceimpl.IBookingServiceImpl;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	IBookingServiceImpl service;
<<<<<<< HEAD

=======
	
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	@PostMapping("/")
	public String addBooking(@RequestBody Booking booking) {
		return service.addBooking(booking);
	}
<<<<<<< HEAD

	@DeleteMapping("/delete")
	public String deleteBooking(@RequestBody Integer bookingId) throws BookingNotFoundException {
		return service.cancelBooking(bookingId);
	}

	@GetMapping("/viewbookings")
	public List<Booking> viewBookings() {
		return service.viewBookings();
	}

	@GetMapping("/bypassengerid/{passengerid}")
	public List<Booking> getBookingByPassengerId(@PathVariable("passengerid") Long passengerId) throws BookingNotFoundException {
		return service.viewBookingByPassengerId(passengerId);
	}

	@GetMapping("/bybookingid/{bookingid}")
	public Booking viewBookingByBookingId(@PathVariable("bookingId") Integer bookingId) throws BookingNotFoundException {
		return service.viewBookingByBookingId(bookingId);
	}

	@GetMapping("/bydate/{bookingdate}")
	public List<Booking> viewBookingByDate(@PathVariable("bookingdate") LocalDate bookingDate) throws BookingNotFoundException {
		return service.viewBookingByDate(bookingDate);
	}

	@GetMapping("/byflight/{flightid}")
	public List<Booking> viewBookingsByFlightId(@PathVariable("flightid") Integer flightid) throws BookingNotFoundException {
		return service.viewBookingsByFlightId(flightid);
	}

=======
	
	@DeleteMapping("/delete")
	public String deleteBooking(@RequestBody Integer bookingId) {
		return service.cancelBooking(bookingId);
	}
	
	@GetMapping("/viewbookings")
	public List<Booking> viewBookings(){
		return service.viewBookings();
	}
	
	@GetMapping("/bypassengerid/{passengerid}")
	public List<Booking> getBookingByPassengerId(@PathVariable("passengerid") Long passengerId){
		return service.viewBookingByPassengerId(passengerId);
	}
	@GetMapping("/bybookingid/{bookingid}")
	public Booking viewBookingByBookingId(@PathVariable ("bookingId") Integer bookingId) {
		return service.viewBookingByBookingId(bookingId);
	}
	
	@GetMapping("/bydate/{bookingdate}")
	public List<Booking> viewBookingByDate(@PathVariable ("bookingdate") LocalDate bookingDate) {
		return service.viewBookingByDate(bookingDate);
	}
	
	@GetMapping("/byflight/{flightid}")
	public List<Booking> viewBookingsByFlightId(@PathVariable ("flightid") Integer flightid) {
		return service.viewBookingsByFlightId(flightid);
	}
	
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	@PutMapping("/update")
	public Booking updateBooking(@RequestBody Booking booking) {
		return service.updateBooking(booking);
	}
}
