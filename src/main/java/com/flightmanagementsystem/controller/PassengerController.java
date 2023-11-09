package com.flightmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import com.flightmanagementsystem.dto.PassengerDTO;
=======
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
import com.flightmanagementsystem.entity.Passenger;
import com.flightmanagementsystem.service.IPassengerService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

	@Autowired
	IPassengerService service;
<<<<<<< HEAD

=======
	
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	@PostMapping("/")
	public String addPassenger(@RequestBody Passenger passenger) {
		return service.addPassenger(passenger);
	}
<<<<<<< HEAD

	@GetMapping("/allpassenger")
	public List<PassengerDTO> getAllPassenger() {
		return service.viewAllPassenger();
	}

	@GetMapping("/byuin/{uin}")
	public PassengerDTO getByUin(@PathVariable("uin") long uin) {
		return service.viewPassengerByUIN(uin);
	}

	@GetMapping("/bymobile/{mob}")
	public PassengerDTO getByMobileNumber(@PathVariable("mob") long contactNo) {
=======
	
	@GetMapping("/allpassenger")
	public List<Passenger> getAllPassenger(){
		return service.viewAllPassenger();
	}
	@GetMapping("/byuin/{uin}")
	public Passenger getByUin(@PathVariable("uin") long uin) {
		return service.viewPassengerByUIN(uin);
	}
	@GetMapping("/bymobile/{mob}")
	public Passenger getByMobileNumber(@PathVariable("mob") long contactNo) {
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
		return service.viewPassengerByMobileNo(contactNo);
	}
}
