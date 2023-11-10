package com.flightmanagementsystem.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightmanagementsystem.entity.Schedule;
import com.flightmanagementsystem.exception.ScheduleManagementException;
import com.flightmanagementsystem.serviceimpl.IScheduleServiceImpl;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
	@Autowired
	IScheduleServiceImpl service;

	@PostMapping("/")
	public String addSchedule(@RequestBody Schedule schedule) {
		return service.addSchedule(schedule);
	}

	@PutMapping("/update")
	public Schedule updateSchedule(@RequestBody Schedule schedule) {
		return service.updateSchedule(schedule);
	}

	@GetMapping("/allschedule")
	public List<Schedule> getAllPassenger() throws ScheduleManagementException {
		return service.viewSchedules();
	}

	@GetMapping("/src_dest/{source}/{destination}")
	public List<Schedule> getBySourceAndDestination(@PathVariable("source") String source,
			@PathVariable("destination") String destination) throws ScheduleManagementException {
		return service.viewBySourceAndDestination(source, destination);
	}
	
	@GetMapping("/src_dest_dt/{source}/{destination}/{depdate}")
	public List<Schedule> getBySourceDestinationAndDepartureDate(@PathVariable("source") String source,
			@PathVariable("destination") String destination, @PathVariable("depdate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDate date)
			throws ScheduleManagementException {
		return service.viewBySourceDestinationAndDepartureDate(source, destination, date);

	}

	@GetMapping("/dep_time/{datetime}")
	public List<Schedule> getByDepartureTime(@PathVariable("datetime")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime datetime)
			throws ScheduleManagementException {
		return service.viewByDepartureTime(datetime);
	}
}
