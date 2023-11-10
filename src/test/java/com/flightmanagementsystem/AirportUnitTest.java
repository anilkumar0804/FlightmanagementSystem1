package com.flightmanagementsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightmanagementsystem.entity.Airport;
import com.flightmanagementsystem.repository.AirportRepository;
import com.flightmanagementsystem.service.IAirportService;
import com.flightmanagementsystem.serviceimpl.IAirportServiceImpl;

@SpringBootTest
class AirportUnitTest {

    @Mock
     AirportRepository airportRepository;
    
    @InjectMocks
    private IAirportService airportService = new IAirportServiceImpl();

    

    @Test
    void addAirportDetails() {
        Airport airport = new Airport(103,"Pune AP","Pune","INDIA");

        when(airportRepository.save(airport)).thenReturn(airport);

        String result = airportService.addAirportDetails(airport);

        assertEquals("Airport added.", result);
        verify(airportRepository, times(1)).save(airport);
    }

    @Test
    void viewAirports() {
        Airport airport1 = new Airport(101,"CSMA","Mumdai","INDIA");
        Airport airport2 = new Airport(102,"DBAIA","Nagpur","INDIA");

        when(airportRepository.findAll()).thenReturn(Arrays.asList(airport1, airport2));

        List<Airport> airports = airportService.viewAirports();

        assertEquals(2, airports.size());
        verify(airportRepository, times(1)).findAll();
    }


    @Test
    void updateAirportDetails() {
        Airport airport = new Airport(104,"Pune AP","Pune","INDIA");

        when(airportRepository.save(any())).thenReturn(airport);

        Airport updatedAirport = airportService.updateAirportDetails(airport);

        assertEquals(airport, updatedAirport);
        verify(airportRepository, times(1)).save(any());
    }
}

