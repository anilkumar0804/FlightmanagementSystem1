package com.flightmanagementsystem.service;

import java.util.List;

import com.flightmanagementsystem.dto.PassengerDTO;
import com.flightmanagementsystem.entity.Passenger;
import com.flightmanagementsystem.exception.PassengerManagementException;

public interface IPassengerService {
	String addPassenger(Passenger passenger);

	List<PassengerDTO> viewAllPassenger();
	PassengerDTO viewPassengerByUIN(Long uin) throws PassengerManagementException;
	PassengerDTO viewPassengerByMobileNo(Long contactNo) throws PassengerManagementException;
	PassengerDTO toPassengerDto(Passenger passenger);

}
