package com.flightmanagementsystem.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
=======
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Schedule")
public class Schedule {

	@Id
<<<<<<< HEAD
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int scheduleId;
	@Valid
	@OneToOne
	private Airport sourceAirport;
	@Valid
	@OneToOne
	private Airport destinationAirport;
	@NotNull(message = "Arrival Date should not be null")
	private LocalDateTime arrivalDate;
	@NotNull(message="Destination Date should not be null")
=======
	private int scheduleId;
	@OneToOne
	private Airport sourceAirport;
	@OneToOne
	private Airport destinationAirport;
	private LocalDateTime arrivalDate;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
	private LocalDateTime departureDate;

}
