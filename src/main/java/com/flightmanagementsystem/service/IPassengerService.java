package com.flightmanagementsystem.service;

import java.util.List;

import com.flightmanagementsystem.dto.PassengerDTO;
import com.flightmanagementsystem.entity.Passenger;
import com.flightmanagementsystem.exception.PassengerException;

public interface IPassengerService {
	String addPassenger(Passenger passenger);

	List<PassengerDTO> viewAllPassenger()throws PassengerException;

	PassengerDTO viewPassengerByUIN(Long uin) throws PassengerException;

	PassengerDTO viewPassengerByMobileNo(Long contactNo) throws PassengerException;

}
