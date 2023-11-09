package com.flightmanagementsystem.serviceimpl;

import java.util.List;
<<<<<<< HEAD
import java.util.stream.Collectors;
=======
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.flightmanagementsystem.dto.PassengerDTO;
import com.flightmanagementsystem.entity.Passenger;
import com.flightmanagementsystem.exception.PassengerException;
=======
import com.flightmanagementsystem.entity.Passenger;
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
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
	public List<PassengerDTO> viewAllPassenger() throws PassengerException {

		List<PassengerDTO> passengerlist= passengerRepository.findAll().stream().map(e -> toPassengerDto(e)).collect(Collectors.toList());
		if(passengerlist.size()==0) {throw new PassengerException("No data in the list");}
		else {return passengerlist;}
	}

	@Override
	public PassengerDTO viewPassengerByUIN(Long uin) throws PassengerException {

		if(passengerRepository.findByPassengerUIN(uin)==null) {throw new PassengerException("invlaid UIN");}
		else {
		Passenger passenger = passengerRepository.findByPassengerUIN(uin);
		// converting Passenger into PassengerDTO
		PassengerDTO object = toPassengerDto(passenger);

		return object;}
	}

	@Override
	public PassengerDTO viewPassengerByMobileNo(Long contactNo) throws PassengerException  {
		if(passengerRepository.findByMobileNumber(contactNo)==null) {throw new PassengerException("Invlaid Contact number");}
		else {
	   Passenger passenger= passengerRepository.findByMobileNumber(contactNo);
	   PassengerDTO object= toPassengerDto(passenger);
	   return object;}

	}

	// method to convert Passenger into PassengerDTO
	private PassengerDTO toPassengerDto(Passenger passenger) {
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

=======
	public List<Passenger> viewAllPassenger() {

		return passengerRepository.findAll();

	}

	@Override
	public Passenger viewPassengerByUIN(Long uin) {

		return passengerRepository.findById(uin).get();

	}

	@Override
	public Passenger viewPassengerByMobileNo(Long contactNo) {

		return passengerRepository.findAll().stream().filter(e -> e.getMobileNumber() == contactNo).findAny().get();
		
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	}

}
