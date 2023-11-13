package com.flightmanagementsystem.serviceimpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightmanagementsystem.entity.Schedule;
<<<<<<< HEAD
import com.flightmanagementsystem.exception.ScheduleManagementException;
=======
import com.flightmanagementsystem.exception.ScheducleManagementException;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
import com.flightmanagementsystem.repository.ScheduleRepository;
import com.flightmanagementsystem.service.IScheduleService;

@Service
public class IScheduleServiceImpl implements IScheduleService {
<<<<<<< HEAD

=======
	
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
	@Autowired
	ScheduleRepository scheduleRepository;

	@Override
	public String addSchedule(Schedule schedule) {
<<<<<<< HEAD

=======
		
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		scheduleRepository.save(schedule);
		return "Schedule added.";
	}

	@Override
	public Schedule updateSchedule(Schedule schedule) {
<<<<<<< HEAD
		Schedule object = new Schedule();
=======
		Schedule object= new Schedule();
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
		object.setScheduleId(schedule.getScheduleId());
		object.setSourceAirport(schedule.getSourceAirport());
		object.setDestinationAirport(schedule.getDestinationAirport());
		object.setArrivalDate(schedule.getArrivalDate());
		object.setDepartureDate(schedule.getDepartureDate());
		scheduleRepository.save(object);
		return object;
	}

	@Override
<<<<<<< HEAD
	public List<Schedule> viewSchedules()  {

		return scheduleRepository.findAll();
	}

	@Override
	public List<Schedule> viewBySourceAndDestination(String source, String destination)
			throws ScheduleManagementException {

		List<Schedule> viewBySandDlist = scheduleRepository.findAll().stream()
				.filter(e -> e.getSourceAirport().getAirportName().equals(source)
						&& e.getDestinationAirport().getAirportName().equals(destination))
				.collect(Collectors.toList());
		if (viewBySandDlist.size() == 0) {
			throw new ScheduleManagementException("Invalid source or invalid destination");
		} else {
			return viewBySandDlist;
		}
=======
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
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
	}

	@Override
	public List<Schedule> viewBySourceDestinationAndDepartureDate(String source, String destination,
<<<<<<< HEAD
			LocalDate departureDate) throws ScheduleManagementException {

		List<Schedule> listSandDdate = viewBySourceAndDestination(source, destination).stream()
				.filter(e -> e.getDepartureDate().toLocalDate().isEqual(departureDate)).collect(Collectors.toList());
		if (listSandDdate.size() == 0) {
			throw new ScheduleManagementException("Invalid date");
		} else {
			return listSandDdate;
		}
	}

	@Override
	public List<Schedule> viewByDepartureTime(LocalDateTime dateTime) throws ScheduleManagementException {

		List<Schedule> viewByDtime = scheduleRepository.findAll().stream()
				.filter(e -> e.getDepartureDate().isEqual(dateTime)).collect(Collectors.toList());
		if (viewByDtime.size() == 0) {
			throw new ScheduleManagementException("No schedule for given time.");
		} else {
			return viewByDtime;
		}
	}
=======
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
	
	
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

}
