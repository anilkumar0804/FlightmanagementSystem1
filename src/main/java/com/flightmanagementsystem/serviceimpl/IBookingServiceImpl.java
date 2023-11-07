package com.flightmanagementsystem.serviceimpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.flightmanagementsystem.dto.BookingDTO;
import com.flightmanagementsystem.service.IBookingService;

@Service
public class IBookingServiceImpl implements IBookingService {

	@Override
	public BookingDTO addBooking(BookingDTO booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookingDTO cancelBooking(Integer bookingid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookingDTO> viewBookings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookingDTO> viewBookingByPassengerId(Integer passengerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookingDTO viewBookingByBookingId(Integer bookingid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookingDTO> viewBookingByDate(LocalDate bookingdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookingDTO> viewBookingsByFlightId(Integer flightid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookingDTO updateBooking(BookingDTO booking) {
		// TODO Auto-generated method stub
		return null;
	}

}
