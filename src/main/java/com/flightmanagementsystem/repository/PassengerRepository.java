package com.flightmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightmanagementsystem.entity.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {
	 

	Passenger findByPassengerUIN(Long uin);
	Passenger findByMobileNumber(Long contact);
}
