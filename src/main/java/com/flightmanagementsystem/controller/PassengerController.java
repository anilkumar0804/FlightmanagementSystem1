package com.flightmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightmanagementsystem.dto.PassengerDTO;
import com.flightmanagementsystem.entity.Passenger;
<<<<<<< HEAD
import com.flightmanagementsystem.exception.PassengerManagementException;
=======
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
import com.flightmanagementsystem.service.IPassengerService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

	@Autowired
	IPassengerService service;

	@PostMapping("/")
	public String addPassenger(@RequestBody Passenger passenger) {
		return service.addPassenger(passenger);
	}

	@GetMapping("/allpassenger")
<<<<<<< HEAD
	public List<PassengerDTO> getAllPassenger() throws PassengerManagementException {
=======
	public List<PassengerDTO> getAllPassenger() {
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		return service.viewAllPassenger();
	}

	@GetMapping("/byuin/{uin}")
<<<<<<< HEAD
	public PassengerDTO getByUin(@PathVariable("uin") long uin) throws PassengerManagementException {
=======
	public PassengerDTO getByUin(@PathVariable("uin") long uin) {
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		return service.viewPassengerByUIN(uin);
	}

	@GetMapping("/bymobile/{mob}")
<<<<<<< HEAD
	public PassengerDTO getByMobileNumber(@PathVariable("mob") long contactNo) throws PassengerManagementException {
=======
	public PassengerDTO getByMobileNumber(@PathVariable("mob") long contactNo) {
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		return service.viewPassengerByMobileNo(contactNo);
	}
}
