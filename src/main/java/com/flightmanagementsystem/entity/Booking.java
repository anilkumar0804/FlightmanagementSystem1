package com.flightmanagementsystem.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Booking")
public class Booking {

	@Id
	private Integer bookingId;
	private Passenger passenger;
	private LocalDate bookingDate;
	private List<Passenger> passengerList;
	private Double totalCost;
	private Flight flight;
	private Integer noOfPassengers;

}
