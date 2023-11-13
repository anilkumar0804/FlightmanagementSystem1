package com.flightmanagementsystem.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
=======
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
<<<<<<< HEAD
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
=======
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

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
<<<<<<< HEAD
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
=======
	private Integer bookingId;
//	private Passenger passenger;
	private LocalDate bookingDate;
	@OneToMany
	private List<Passenger> passengerList;
	private Double totalCost;
	@OneToOne
	private Flight flight;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
	private Integer noOfPassengers;

}
