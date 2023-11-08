package com.flightmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightmanagementsystem.entity.Passenger;
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
	public List<Passenger> getAllPassenger() {
		return service.viewAllPassenger();
	}

	@GetMapping("/byuin/{uin}")
	public Passenger getByUin(@PathVariable("uin") long uin) {
		return service.viewPassengerByUIN(uin);
	}

	@GetMapping("/bymobile/{mob}")
	public Passenger getByMobileNumber(@PathVariable("mob") long contactNo) {
		return service.viewPassengerByMobileNo(contactNo);
	}
}
