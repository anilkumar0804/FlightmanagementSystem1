package com.flightmanagementsystem.entity;

import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
=======
import javax.persistence.Id;
import javax.persistence.Table;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Airport")
public class Airport {

	@Id
<<<<<<< HEAD
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer airportId;
	@NotBlank(message="Airport name is required")
	private String airportName;
	@NotBlank(message="Airport city is required")
	private String airportCity;
	@NotBlank(message="Airport country is required")
=======
	private Integer airportId;
	private String airportName;
	private String airportCity;
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62
	private String airportCountry;

}