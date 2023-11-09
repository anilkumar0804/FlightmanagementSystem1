package com.flightmanagementsystem.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
	private int scheduleId;
	@OneToOne
	private Airport sourceAirport;
	@OneToOne
	private Airport destinationAirport;
	private LocalDateTime arrivalDate;
	private LocalDateTime departureDate;

}
