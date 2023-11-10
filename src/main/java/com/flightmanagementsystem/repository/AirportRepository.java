package com.flightmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightmanagementsystem.entity.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {
	


}
