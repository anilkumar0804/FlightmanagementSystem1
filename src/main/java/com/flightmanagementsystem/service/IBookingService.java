package com.flightmanagementsystem.service;

import java.time.LocalDate;

import java.util.List;

import com.flightmanagementsystem.entity.Booking;
import com.flightmanagementsystem.exception.BookingNotFoundException;

public interface IBookingService {

	public String addBooking(Booking booking);

	public String cancelBooking(Integer bookingid) throws BookingNotFoundException;

	public List<Booking> viewBookings();

	public List<Booking> viewBookingByPassengerId(Long passengerId) throws BookingNotFoundException;

	public Booking viewBookingByBookingId(Integer bookingid) throws BookingNotFoundException;

	public List<Booking> viewBookingByDate(LocalDate bookingdate) throws BookingNotFoundException;

	public List<Booking> viewBookingsByFlightId(Integer flightid) throws BookingNotFoundException;

	public Booking updateBooking(Booking booking);
}
