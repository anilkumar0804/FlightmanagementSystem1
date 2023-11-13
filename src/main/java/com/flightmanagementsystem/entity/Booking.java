package com.flightmanagementsystem.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer bookingId;
	@NotNull(message="Booking date is required")
	private LocalDate bookingDate;
	@Valid
	@OneToMany
	private List<Passenger> passengerList;
	@NotNull(message="Booking cost is required")
	private Double totalCost;
	@OneToOne
	@NotNull(message="Booking flight is required")
	private Flight flight;
	@NotNull(message="Number of passenger is required")
	@Min(value = 1, message = "Number of passengers must be at least 1")
	private Integer noOfPassengers;

}
