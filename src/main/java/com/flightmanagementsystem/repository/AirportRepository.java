package com.flightmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightmanagementsystem.entity.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {
	
//	public Airport addAirportDetails(Airport airport);
//
//	public List<Airport> viewAirports();
//
//	public List<Airport> viewByCountry(String country);
//
//	public List<Airport> viewByCity(String city);
//
//	public List<Airport> viewByAirportName(String airportName);
//
//	public Airport updateAirportDetails(Airport airport);

}
