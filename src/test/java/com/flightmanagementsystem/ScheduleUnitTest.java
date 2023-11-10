package com.flightmanagementsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightmanagementsystem.entity.Airport;
import com.flightmanagementsystem.entity.Schedule;
import com.flightmanagementsystem.exception.ScheduleManagementException;
import com.flightmanagementsystem.repository.ScheduleRepository;
import com.flightmanagementsystem.serviceimpl.IScheduleServiceImpl;

@SpringBootTest
class ScheduleUnitTest {

	@InjectMocks
	private IScheduleServiceImpl scheduleService;

	@Mock
	private ScheduleRepository scheduleRepository;

	private Schedule testSchedule;

	@BeforeEach
	void setUp() {

		Airport sourceAirport = new Airport(122, "DBAIA", "Nagpur", "INDIA");
		Airport destinationAirport = new Airport(178, "CSMIA", "Mumbai", "INDIA");

		// Initialize a test Schedule object
		testSchedule = new Schedule();
		testSchedule.setScheduleId(1);
		testSchedule.setDepartureDate(LocalDateTime.of(2023, 11, 17, 15, 30, 45));
		testSchedule.setArrivalDate(LocalDateTime.of(2023, 11, 10, 17, 37, 45));
		testSchedule.setSourceAirport(sourceAirport);
		testSchedule.setDestinationAirport(destinationAirport);

		// Set other properties as needed
	}

	@Test
	void addSchedule() {
		when(scheduleRepository.save(any(Schedule.class))).thenReturn(testSchedule);

		String result = scheduleService.addSchedule(testSchedule);

		assertEquals("Schedule added.", result);
		verify(scheduleRepository, times(1)).save(any(Schedule.class));
	}

	@Test
	void updateSchedule() {
		when(scheduleRepository.save(any())).thenReturn(testSchedule);

		Schedule result = scheduleService.updateSchedule(testSchedule);

		assertNotNull(result);
		assertEquals(testSchedule.getScheduleId(), result.getScheduleId());
		verify(scheduleRepository, times(1)).save(any());
	}

	@Test
	void viewSchedules() throws ScheduleManagementException {
		when(scheduleRepository.findAll()).thenReturn(Arrays.asList(testSchedule));

		List<Schedule> schedules = scheduleService.viewSchedules();

		assertEquals(1, schedules.size());
		verify(scheduleRepository, times(1)).findAll();
	}

	@Test
	void viewBySourceAndDestination() throws ScheduleManagementException {
		String source = "DBAIA";
		String destination = "CSMIA";
		when(scheduleRepository.findAll()).thenReturn(Arrays.asList(testSchedule));

		List<Schedule> result = scheduleService.viewBySourceAndDestination(source, destination);

		assertNotNull(result);
		assertEquals(1, result.size());
		verify(scheduleRepository, times(1)).findAll();
	}

	@Test
	void viewBySourceDestinationAndDepartureDate() throws ScheduleManagementException {
		String source = "DBAIA";
		String destination = "CSMIA";
		LocalDate departureDate = LocalDate.of(2023, 11, 17);
		when(scheduleRepository.findAll()).thenReturn(Arrays.asList(testSchedule));

		List<Schedule> result = scheduleService.viewBySourceDestinationAndDepartureDate(source, destination,
				departureDate);

		assertNotNull(result);
		assertEquals(1, result.size());
		verify(scheduleRepository, times(1)).findAll();
	}

	@Test
	void viewByDepartureTime() throws ScheduleManagementException {
		LocalDateTime dateTime = LocalDateTime.of(2023, 11, 17, 15, 30, 45);
		when(scheduleRepository.findAll()).thenReturn(Arrays.asList(testSchedule));

		List<Schedule> result = scheduleService.viewByDepartureTime(dateTime);

		assertNotNull(result);
		assertEquals(1, result.size());
		verify(scheduleRepository, times(1)).findAll();
	}
}