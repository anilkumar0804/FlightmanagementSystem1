package com.flightmanagementsystem.service;

import java.time.LocalDate;

import java.util.List;

import com.flightmanagementsystem.entity.Booking;
<<<<<<< HEAD
import com.flightmanagementsystem.exception.BookingNotFoundException;
=======
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d

public interface IBookingService {

	public String addBooking(Booking booking);

<<<<<<< HEAD
	public String cancelBooking(Integer bookingid) throws BookingNotFoundException;

	public List<Booking> viewBookings();

	public List<Booking> viewBookingByPassengerId(Long passengerId) throws BookingNotFoundException;

	public Booking viewBookingByBookingId(Integer bookingid) throws BookingNotFoundException;

	public List<Booking> viewBookingByDate(LocalDate bookingdate) throws BookingNotFoundException;

	public List<Booking> viewBookingsByFlightId(Integer flightid) throws BookingNotFoundException;
=======
	public String cancelBooking(Integer bookingid);

	public List<Booking> viewBookings();

	public List<Booking> viewBookingByPassengerId(Long passengerId);

	public Booking viewBookingByBookingId(Integer bookingid);

	public List<Booking> viewBookingByDate(LocalDate bookingdate);

	public List<Booking> viewBookingsByFlightId(Integer flightid);
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d

	public Booking updateBooking(Booking booking);
}
