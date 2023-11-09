package com.flightmanagementsystem.serviceimpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Schedule;
import com.flightmanagementsystem.exception.ScheducleManagementException;
import com.flightmanagementsystem.repository.ScheduleRepository;
import com.flightmanagementsystem.service.IScheduleService;

@Service
public class IScheduleServiceImpl implements IScheduleService {
	
	@Autowired
	ScheduleRepository scheduleRepository;

	@Override
	public String addSchedule(Schedule schedule) {
		
		scheduleRepository.save(schedule);
		return "Schedule added.";
	}

	@Override
	public Schedule updateSchedule(Schedule schedule) {
		Schedule object= new Schedule();
		object.setScheduleId(schedule.getScheduleId());
		object.setSourceAirport(schedule.getSourceAirport());
		object.setDestinationAirport(schedule.getDestinationAirport());
		object.setArrivalDate(schedule.getArrivalDate());
		object.setDepartureDate(schedule.getDepartureDate());
		scheduleRepository.save(object);
		return object;
	}

	@Override
	public List<Schedule> viewSchedules() throws ScheducleManagementException {
		
		List<Schedule>allSchedules= scheduleRepository.findAll();
		if(allSchedules.size()==0) {throw new ScheducleManagementException("no Schedules in the list");}
		else {return allSchedules;}
	}

	@Override
	public List<Schedule> viewBySourceAndDestination(String source, String destination) throws ScheducleManagementException{
		
		List<Schedule> viewBySandDlist= scheduleRepository.findAll().stream().filter(e->e.getSourceAirport().getAirportName().equals(source)&&
				e.getDestinationAirport().getAirportName().equals(destination)).collect(Collectors.toList());
		if(viewBySandDlist.size()==0) {throw new ScheducleManagementException("invalid source and destination");}
		else {return viewBySandDlist;}
	}

	@Override
	public List<Schedule> viewBySourceDestinationAndDepartureDate(String source, String destination,
			LocalDate departureDate) throws ScheducleManagementException {
		
		List<Schedule> viewSandDdate= viewBySourceAndDestination(source, destination).stream().
		filter(e->e.getDepartureDate().toLocalDate().isEqual(departureDate)).collect(Collectors.toList());
		if(viewSandDdate.size()==0) {throw new ScheducleManagementException("invalid source and destination date");}
		else {return viewSandDdate;}
	}

	@Override
	public List<Schedule> viewByDepartureTime(LocalDateTime dateTime)throws ScheducleManagementException {
		
		List<Schedule> viewByDtime= scheduleRepository.findAll().stream().filter(e->e.getDepartureDate().isEqual(dateTime)).collect(Collectors.toList());
		if(viewByDtime.size()==0) {throw new ScheducleManagementException("Invalid departure time");}
		else {return viewByDtime;}
	}
	
	

}
