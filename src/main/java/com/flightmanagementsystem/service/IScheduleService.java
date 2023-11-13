package com.flightmanagementsystem.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Schedule;
<<<<<<< HEAD
import com.flightmanagementsystem.exception.ScheduleManagementException;
=======
import com.flightmanagementsystem.exception.ScheducleManagementException;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

@Service
public interface IScheduleService {
	public String addSchedule(Schedule schedule);

	public Schedule updateSchedule(Schedule schedule);

<<<<<<< HEAD
	public List<Schedule> viewSchedules();

	public List<Schedule> viewBySourceAndDestination(String source, String destination)throws ScheduleManagementException;

	public List<Schedule> viewBySourceDestinationAndDepartureDate(String source, String destination,
			LocalDate departureDate) throws ScheduleManagementException;

	public List<Schedule> viewByDepartureTime(LocalDateTime dateTime) throws ScheduleManagementException;
=======
	public List<Schedule> viewSchedules() throws ScheducleManagementException;

	public List<Schedule> viewBySourceAndDestination(String source, String destination)throws ScheducleManagementException;

	public List<Schedule> viewBySourceDestinationAndDepartureDate(String source, String destination,
			LocalDate departureDate) throws ScheducleManagementException;

	public List<Schedule> viewByDepartureTime(LocalDateTime dateTime) throws ScheducleManagementException;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

}
