package com.flightmanagementsystem.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.dto.PassengerDTO;
import com.flightmanagementsystem.entity.Passenger;
<<<<<<< HEAD
import com.flightmanagementsystem.exception.PassengerManagementException;
=======
import com.flightmanagementsystem.exception.PassengerException;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
import com.flightmanagementsystem.repository.PassengerRepository;
import com.flightmanagementsystem.service.IPassengerService;

@Service
public class IPassengerServiceImpl implements IPassengerService {

	@Autowired
	PassengerRepository passengerRepository;

	@Override
	public String addPassenger(Passenger passenger) {

		passengerRepository.save(passenger);
		return "Passenger Added Successfully";

	}

	@Override
<<<<<<< HEAD
	public List<PassengerDTO> viewAllPassenger() {

		List<PassengerDTO> passengerlist= passengerRepository.findAll().stream().map(e -> toPassengerDto(e)).collect(Collectors.toList());
		
		return passengerlist;
	}

	@Override
	public PassengerDTO viewPassengerByUIN(Long uin) throws PassengerManagementException {

		if(passengerRepository.findByPassengerUIN(uin)==null) {throw new PassengerManagementException("Invlaid UIN.");}
=======
	public List<PassengerDTO> viewAllPassenger() throws PassengerException {

		List<PassengerDTO> passengerlist= passengerRepository.findAll().stream().map(e -> toPassengerDto(e)).collect(Collectors.toList());
		if(passengerlist.size()==0) {throw new PassengerException("No data in the list");}
		else {return passengerlist;}
	}

	@Override
	public PassengerDTO viewPassengerByUIN(Long uin) throws PassengerException {

		if(passengerRepository.findByPassengerUIN(uin)==null) {throw new PassengerException("invlaid UIN");}
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		else {
		Passenger passenger = passengerRepository.findByPassengerUIN(uin);
		// converting Passenger into PassengerDTO
		PassengerDTO object = toPassengerDto(passenger);
<<<<<<< HEAD
		
=======

>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		return object;}
	}

	@Override
<<<<<<< HEAD
	public PassengerDTO viewPassengerByMobileNo(Long contactNo) throws PassengerManagementException  {
		if(passengerRepository.findByMobileNumber(contactNo)==null) {throw new PassengerManagementException("Invlaid Contact number.");}
=======
	public PassengerDTO viewPassengerByMobileNo(Long contactNo) throws PassengerException  {
		if(passengerRepository.findByMobileNumber(contactNo)==null) {throw new PassengerException("Invlaid Contact number");}
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		else {
	   Passenger passenger= passengerRepository.findByMobileNumber(contactNo);
	   PassengerDTO object= toPassengerDto(passenger);
	   return object;}

	}

	// method to convert Passenger into PassengerDTO
<<<<<<< HEAD
	public PassengerDTO toPassengerDto(Passenger passenger) {
=======
	private PassengerDTO toPassengerDto(Passenger passenger) {
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		PassengerDTO object = new PassengerDTO();
		object.setPassengerUIN(passenger.getPassengerUIN());
		object.setPassengerName(passenger.getPassengerName());
		object.setAge(passenger.getAge());
		object.setUserId(passenger.getUserId());
		object.setUserName(passenger.getUserName());
		object.setEmail(passenger.getEmail());
		object.setMobileNumber(passenger.getMobileNumber());
		object.setUserRole(passenger.getUserRole());
		return object;

	}

}
