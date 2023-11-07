package com.flightmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightmanagementsystem.entity.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {
	 
//	Passenger addPassenger(Passenger passenger);
// 
//	List<Passenger> viewAllPassenger();
// 
//	Passenger viewPassengerByUIN(Long uin);
// 
//	Passenger viewPassengerByMobileNo(Long contactNo);
	
}
