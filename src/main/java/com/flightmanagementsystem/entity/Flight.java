package com.flightmanagementsystem.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Flight")
public class Flight {

	@Id
	private Integer flightId;
	private String flightName;
	private Integer seatCapacity;
	private Double fare; // cost per seat
	@OneToMany
	private List<Schedule> schedules;

}
