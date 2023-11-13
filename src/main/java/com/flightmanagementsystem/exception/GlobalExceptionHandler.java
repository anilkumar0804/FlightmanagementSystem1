package com.flightmanagementsystem.exception;

<<<<<<< HEAD
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value=UserManagementException.class)
	public ResponseEntity<String> handleUserManagementException(UserManagementException userException){
		return new ResponseEntity<>(userException.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=ScheduleManagementException.class)
	public ResponseEntity<String> handleScheduleManagementException(ScheduleManagementException scheduleException){
		return new ResponseEntity<>(scheduleException.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=PassengerManagementException.class)
	public ResponseEntity<String> handlePassengerManagementException(PassengerManagementException passengerException){
		return new ResponseEntity<>(passengerException.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=FlightManagementException.class)
	public ResponseEntity<String> handleFlightManagementException(FlightManagementException flightException){
		return new ResponseEntity<>(flightException.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=BookingManagementException.class)
	public ResponseEntity<String> handleBookingManagementException(BookingManagementException bookingException){
		return new ResponseEntity<>(bookingException.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=AirportManagementException.class)
	public ResponseEntity<String> handleAirportManagementException(AirportManagementException airportException){
		return new ResponseEntity<>(airportException.getMessage(),HttpStatus.NOT_FOUND);
	}
=======
public class GlobalExceptionHandler {

>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
}
