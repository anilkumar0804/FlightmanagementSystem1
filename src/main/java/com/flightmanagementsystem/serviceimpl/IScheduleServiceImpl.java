package com.flightmanagementsystem.serviceimpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Schedule;
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
	public List<Schedule> viewSchedules() {
		
		return scheduleRepository.findAll();
	}

	@Override
	public List<Schedule> viewBySourceAndDestination(String source, String destination) {
		
		return scheduleRepository.findAll().stream().filter(e->e.getSourceAirport().getAirportName().equals(source)&&
				e.getDestinationAirport().getAirportName().equals(destination)).collect(Collectors.toList());
	}

	@Override
	public List<Schedule> viewBySourceDestinationAndDepartureDate(String source, String destination,
			LocalDate departureDate) {
		
		return viewBySourceAndDestination(source, destination).stream().
		filter(e->e.getDepartureDate().toLocalDate().isEqual(departureDate)).collect(Collectors.toList());
		
	}

	@Override
	public List<Schedule> viewByDepartureTime(LocalDateTime dateTime) {
		
		return scheduleRepository.findAll().stream().filter(e->e.getDepartureDate().isEqual(dateTime)).collect(Collectors.toList());
		
	}
	
	

}
