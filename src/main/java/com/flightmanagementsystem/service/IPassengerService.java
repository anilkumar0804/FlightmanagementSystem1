package com.flightmanagementsystem.service;

import java.util.List;

import com.flightmanagementsystem.dto.PassengerDTO;
import com.flightmanagementsystem.entity.Passenger;
<<<<<<< HEAD
import com.flightmanagementsystem.exception.PassengerManagementException;
=======
import com.flightmanagementsystem.exception.PassengerException;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

public interface IPassengerService {
	String addPassenger(Passenger passenger);

<<<<<<< HEAD
	List<PassengerDTO> viewAllPassenger();
	PassengerDTO viewPassengerByUIN(Long uin) throws PassengerManagementException;
	PassengerDTO viewPassengerByMobileNo(Long contactNo) throws PassengerManagementException;
	PassengerDTO toPassengerDto(Passenger passenger);
=======
	List<PassengerDTO> viewAllPassenger()throws PassengerException;

	PassengerDTO viewPassengerByUIN(Long uin) throws PassengerException;

	PassengerDTO viewPassengerByMobileNo(Long contactNo) throws PassengerException;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

}
