package com.flightmanagementsystem.service;

import java.time.LocalDate;

import java.util.List;

import com.flightmanagementsystem.entity.Booking;
import com.flightmanagementsystem.exception.BookingManagementException;

public interface IBookingService {

	public String addBooking(Booking booking);

	public String cancelBooking(Integer bookingid) throws BookingManagementException;

	public List<Booking> viewBookings();

	public List<Booking> viewBookingByPassengerId(Long passengerId) throws BookingManagementException;

	public Booking viewBookingByBookingId(Integer bookingid) throws BookingManagementException;

	public List<Booking> viewBookingByDate(LocalDate bookingdate) throws BookingManagementException;

	public List<Booking> viewBookingsByFlightId(Integer flightid) throws BookingManagementException;

	public Booking updateBooking(Booking booking);
}
