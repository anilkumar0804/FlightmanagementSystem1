package com.flightmanagementsystem.service;

import java.time.LocalDate;

import java.util.List;

import com.flightmanagementsystem.entity.Booking;

public interface IBookingService {

	public String addBooking(Booking booking);

	public String cancelBooking(Integer bookingid);

	public List<Booking> viewBookings();

	public List<Booking> viewBookingByPassengerId(Long passengerId);

	public Booking viewBookingByBookingId(Integer bookingid);

	public List<Booking> viewBookingByDate(LocalDate bookingdate);

	public List<Booking> viewBookingsByFlightId(Integer flightid);

	public Booking updateBooking(Booking booking);
}
