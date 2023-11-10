package com.flightmanagementsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightmanagementsystem.entity.Flight;
import com.flightmanagementsystem.repository.FlightRepository;
import com.flightmanagementsystem.service.IFlightService;
import com.flightmanagementsystem.serviceimpl.IFlightServiceImpl;

@SpringBootTest
class FlightUnitTest {

	@Mock
	FlightRepository flightRepository;

	@InjectMocks
	private IFlightService flightService = new IFlightServiceImpl();

	private Flight testFlight;

	@BeforeEach
	void setUp() {

		// Initialize a test Flight object
		testFlight = new Flight();
		testFlight.setFlightId(1);
		testFlight.setFlightName("TestFlight");
		testFlight.setSeatCapacity(100);
		testFlight.setFare(200.0);

	}

	
	@Test
    void viewAllFlights() {
        when(flightRepository.findAll()).thenReturn(Arrays.asList(testFlight));

        List<Flight> flights = flightService.viewAllFlights();

        assertEquals(1, flights.size());
        verify(flightRepository, times(1)).findAll();
    }

	@Test
    void viewByFlightName() {
        when(flightRepository.findAll()).thenReturn(Arrays.asList(testFlight));

        List<Flight> flights = flightService.viewByFlightName();

        assertEquals(1, flights.size());
        assertEquals("TestFlight", flights.get(0).getFlightName());
        verify(flightRepository, times(1)).findAll();
    }

	@Test
    void viewByFlightSeatCapacity() {
        when(flightRepository.findAll()).thenReturn(Arrays.asList(testFlight));

        List<Flight> flights = flightService.viewByFlightSeatCapacity();

        assertEquals(1, flights.size());
        assertEquals(100, flights.get(0).getSeatCapacity());
        verify(flightRepository, times(1)).findAll();
    }

	@Test
    void updateFlight() {
        when(flightRepository.save(any())).thenReturn(testFlight);

        Flight result = flightService.updateFlight(testFlight);

        assertNotNull(result);
        assertEquals(testFlight.getFlightId(), result.getFlightId());
        verify(flightRepository, times(1)).save(any());
    }
}

