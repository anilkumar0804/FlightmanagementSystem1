package com.flightmanagementsystem;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightmanagementsystem.entity.Booking;
import com.flightmanagementsystem.entity.Flight;
import com.flightmanagementsystem.entity.Passenger;
import com.flightmanagementsystem.exception.BookingManagementException;
import com.flightmanagementsystem.repository.BookingRepository;
import com.flightmanagementsystem.service.IBookingService;
import com.flightmanagementsystem.serviceimpl.IBookingServiceImpl;

@SpringBootTest
class BookingUnitTest {

	@Mock
	BookingRepository bookingRepository;

	@InjectMocks
	private IBookingService bookingService = new IBookingServiceImpl();

	private Booking testBooking;

	@BeforeEach
	void setUp() {
		// Initialize a test Booking object
		testBooking = new Booking();
		testBooking.setBookingId(1);
		testBooking.setBookingDate(LocalDate.now());
	}

	@Test
    void addBooking() {
        when(bookingRepository.save(any(Booking.class))).thenReturn(testBooking);

        String result = bookingService.addBooking(testBooking);

        assertEquals("Booking successfull", result);
        verify(bookingRepository, times(1)).save(testBooking);
    }

	@Test
	void cancelBooking() {
		int bookingId = 1;
		when(bookingRepository.findById(bookingId)).thenReturn(java.util.Optional.of(testBooking));

		assertDoesNotThrow(() -> bookingService.cancelBooking(bookingId));
		verify(bookingRepository, times(1)).deleteById(bookingId);
	}

	@Test
	void cancelBookingNotFoundException() {
		int bookingId = 1;
		when(bookingRepository.findById(bookingId)).thenReturn(java.util.Optional.empty());

		assertThrows(BookingManagementException.class, () -> bookingService.cancelBooking(bookingId));
		verify(bookingRepository, never()).deleteById(bookingId);
	}

	@Test
    void viewBookings() {
        when(bookingRepository.findAll()).thenReturn(Arrays.asList(testBooking));

        List<Booking> bookings = bookingService.viewBookings();

        assertEquals(1, bookings.size());
        verify(bookingRepository, times(1)).findAll();
    }

	@Test
	void viewBookingByPassengerId() throws BookingManagementException {
		Long passengerId = 123L;
		Passenger passenger = new Passenger();
		passenger.setPassengerUIN(passengerId);

		testBooking.setPassengerList(Arrays.asList(passenger));
		when(bookingRepository.findAll()).thenReturn(Arrays.asList(testBooking));

		List<Booking> bookings = bookingService.viewBookingByPassengerId(passengerId);

		assertEquals(1, bookings.size());
		assertEquals(passengerId, bookings.get(0).getPassengerList().get(0).getPassengerUIN());
		verify(bookingRepository, times(1)).findAll();
	}

	@Test
	void viewBookingByDate() throws BookingManagementException{
		LocalDate bookingDate = LocalDate.now();
		when(bookingRepository.findAll()).thenReturn(Arrays.asList(testBooking));

		List<Booking> bookings = bookingService.viewBookingByDate(bookingDate);

		assertEquals(1, bookings.size());
		assertEquals(bookingDate, bookings.get(0).getBookingDate());
		verify(bookingRepository, times(1)).findAll();
	}

	@Test
	void viewBookingsByFlightId() throws BookingManagementException {
		int flightId = 123;
		Flight flight = new Flight();
		flight.setFlightId(flightId);
		testBooking.setFlight(flight);

		when(bookingRepository.findAll()).thenReturn(Arrays.asList(testBooking));

		List<Booking> bookings = bookingService.viewBookingsByFlightId(flightId);

		assertEquals(1, bookings.size());
		assertEquals(flightId, bookings.get(0).getFlight().getFlightId());
		verify(bookingRepository, times(1)).findAll();
	}

	@Test
    void updateBooking() {
        when(bookingRepository.save(any())).thenReturn(testBooking);

        Booking result = bookingService.updateBooking(testBooking);

        assertNotNull(result);
        assertEquals(testBooking.getBookingId(), result.getBookingId());
        verify(bookingRepository, times(1)).save(any());
    }
}
