package com.flightmanagementsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
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

import com.flightmanagementsystem.dto.PassengerDTO;
import com.flightmanagementsystem.entity.Passenger;
import com.flightmanagementsystem.exception.PassengerManagementException;
import com.flightmanagementsystem.repository.PassengerRepository;
import com.flightmanagementsystem.serviceimpl.IPassengerServiceImpl;

@SpringBootTest
class PassengerUnitTest {

    @InjectMocks
    private IPassengerServiceImpl passengerService;

    @Mock
    private PassengerRepository passengerRepository;

    private Passenger testPassenger;

    @BeforeEach
    void setUp() {
        // Initialize a test Passenger object
        testPassenger = new Passenger();
        testPassenger.setUserId(1L);
        testPassenger.setEmail("test@example.com");
        testPassenger.setMobileNumber(1234567890L);
        testPassenger.setUserName("testPassenger");
        testPassenger.setUserRole("PASSENGER");
        testPassenger.setPassengerUIN(12345L);
        testPassenger.setPassengerName("John Doe");
        testPassenger.setAge(25);
        // Set other properties as needed
    }

    

    @Test
    void viewAllPassenger() throws PassengerManagementException {
        when(passengerRepository.findAll()).thenReturn(Arrays.asList(testPassenger));

        List<PassengerDTO> passengers = passengerService.viewAllPassenger();

        assertEquals(1, passengers.size());
        verify(passengerRepository, times(1)).findAll();
    }

    @Test
    void viewPassengerByUIN() throws PassengerManagementException {
        Long uin = 12345L;
        when(passengerRepository.findByPassengerUIN(uin)).thenReturn(testPassenger);

        PassengerDTO result = passengerService.viewPassengerByUIN(uin);

        assertNotNull(result);
        assertEquals(uin, result.getPassengerUIN());
        verify(passengerRepository, times(1)).findByPassengerUIN(uin);
    }

   
}

