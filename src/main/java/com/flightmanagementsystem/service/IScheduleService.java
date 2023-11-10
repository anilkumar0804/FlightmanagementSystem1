package com.flightmanagementsystem.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Schedule;
import com.flightmanagementsystem.exception.ScheduleManagementException;

@Service
public interface IScheduleService {
	public String addSchedule(Schedule schedule);

	public Schedule updateSchedule(Schedule schedule);

	public List<Schedule> viewSchedules();

	public List<Schedule> viewBySourceAndDestination(String source, String destination)throws ScheduleManagementException;

	public List<Schedule> viewBySourceDestinationAndDepartureDate(String source, String destination,
			LocalDate departureDate) throws ScheduleManagementException;

	public List<Schedule> viewByDepartureTime(LocalDateTime dateTime) throws ScheduleManagementException;

}
