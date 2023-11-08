package com.flightmanagementsystem.service;

import java.util.List;
import com.flightmanagementsystem.entity.Passenger;

public interface IPassengerService {
	String addPassenger(Passenger passenger);

	List<Passenger> viewAllPassenger();

	Passenger viewPassengerByUIN(Long uin);

	Passenger viewPassengerByMobileNo(Long contactNo);

}
