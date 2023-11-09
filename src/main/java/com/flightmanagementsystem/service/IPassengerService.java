package com.flightmanagementsystem.service;

import java.util.List;
<<<<<<< HEAD

import com.flightmanagementsystem.dto.PassengerDTO;
import com.flightmanagementsystem.entity.Passenger;
import com.flightmanagementsystem.exception.PassengerException;
=======
import com.flightmanagementsystem.entity.Passenger;
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d

public interface IPassengerService {
	String addPassenger(Passenger passenger);

<<<<<<< HEAD
	List<PassengerDTO> viewAllPassenger()throws PassengerException;

	PassengerDTO viewPassengerByUIN(Long uin) throws PassengerException;

	PassengerDTO viewPassengerByMobileNo(Long contactNo) throws PassengerException;
=======
	List<Passenger> viewAllPassenger();

	Passenger viewPassengerByUIN(Long uin);

	Passenger viewPassengerByMobileNo(Long contactNo);
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d

}
