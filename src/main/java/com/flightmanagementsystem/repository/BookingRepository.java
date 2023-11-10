package com.flightmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightmanagementsystem.entity.Booking;
import com.flightmanagementsystem.entity.Passenger;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer>{
	
	
	

}
