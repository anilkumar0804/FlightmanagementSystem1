package com.flightmanagementsystem.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Passenger;
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
		
	}

}
