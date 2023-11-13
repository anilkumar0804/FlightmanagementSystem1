package com.flightmanagementsystem.entity;

import java.util.List;

import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
=======
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

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
<<<<<<< HEAD
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer flightId;
	@NotBlank(message = "Flight name must not be null")
	private String flightName;
	@NotNull(message = "Seat capacity must not be null")
	@Min(value = 10,message = "Seat capacity should be minimum 10")
	private Integer seatCapacity;
	@NotNull(message = "Fare must not be null")
	@Min(value=1,message = "Flight fare should be minimum 1")
	private Double fare;
	@OneToMany
	@Valid
=======
	private Integer flightId;
	private String flightName;
	private Integer seatCapacity;
	private Double fare; // cost per seat
	@OneToMany
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
	private List<Schedule> schedules;

}
