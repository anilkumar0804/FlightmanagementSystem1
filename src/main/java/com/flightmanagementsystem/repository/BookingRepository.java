package com.flightmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightmanagementsystem.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer>{
	
	
	

}
