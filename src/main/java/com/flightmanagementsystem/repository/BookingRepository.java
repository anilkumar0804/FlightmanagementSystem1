package com.flightmanagementsystem.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightmanagementsystem.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer>{
	
	public Booking addBooking(Booking booking);

	public Booking cancelBooking(Integer bookingid);

	public List<Booking> viewBookings();

	public List<Booking> viewBookingByPassengerId(Integer passengerId);

	public Booking viewBookingByBookingId(Integer bookingid);

	public List<Booking> viewBookingByDate(LocalDate bookingdate);

	public List<Booking> viewBookingsByFlightId(Integer flightid);

	public Booking updateBooking(Booking booking);

}
