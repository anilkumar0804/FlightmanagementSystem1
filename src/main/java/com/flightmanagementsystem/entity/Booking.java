package com.flightmanagementsystem.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	private LocalDate bookingDate;
	@OneToMany
	private List<Passenger> passengerList;
	private Double totalCost;
	@OneToOne
	private Flight flight;
	private Integer noOfPassengers;

}
