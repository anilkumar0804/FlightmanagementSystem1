package com.flightmanagementsystem.service;

import java.time.LocalDate;

import java.util.List;

import com.flightmanagementsystem.entity.Booking;
<<<<<<< HEAD
import com.flightmanagementsystem.exception.BookingManagementException;
=======
import com.flightmanagementsystem.exception.BookingNotFoundException;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

public interface IBookingService {

	public String addBooking(Booking booking);

<<<<<<< HEAD
	public String cancelBooking(Integer bookingid) throws BookingManagementException;

	public List<Booking> viewBookings();

	public List<Booking> viewBookingByPassengerId(Long passengerId) throws BookingManagementException;

	public Booking viewBookingByBookingId(Integer bookingid) throws BookingManagementException;

	public List<Booking> viewBookingByDate(LocalDate bookingdate) throws BookingManagementException;

	public List<Booking> viewBookingsByFlightId(Integer flightid) throws BookingManagementException;
=======
	public String cancelBooking(Integer bookingid) throws BookingNotFoundException;

	public List<Booking> viewBookings();

	public List<Booking> viewBookingByPassengerId(Long passengerId) throws BookingNotFoundException;

	public Booking viewBookingByBookingId(Integer bookingid) throws BookingNotFoundException;

	public List<Booking> viewBookingByDate(LocalDate bookingdate) throws BookingNotFoundException;

	public List<Booking> viewBookingsByFlightId(Integer flightid) throws BookingNotFoundException;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

	public Booking updateBooking(Booking booking);
}
