package com.flightmanagementsystem.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Schedule;
<<<<<<< HEAD
import com.flightmanagementsystem.exception.ScheducleManagementException;
=======
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d

@Service
public interface IScheduleService {
	public String addSchedule(Schedule schedule);

	public Schedule updateSchedule(Schedule schedule);

<<<<<<< HEAD
	public List<Schedule> viewSchedules() throws ScheducleManagementException;

	public List<Schedule> viewBySourceAndDestination(String source, String destination)throws ScheducleManagementException;

	public List<Schedule> viewBySourceDestinationAndDepartureDate(String source, String destination,
			LocalDate departureDate) throws ScheducleManagementException;

	public List<Schedule> viewByDepartureTime(LocalDateTime dateTime) throws ScheducleManagementException;
=======
	public List<Schedule> viewSchedules();

	public List<Schedule> viewBySourceAndDestination(String source, String destination);

	public List<Schedule> viewBySourceDestinationAndDepartureDate(String source, String destination,
			LocalDate departureDate);

	public List<Schedule> viewByDepartureTime(LocalDateTime dateTime);
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d

}
