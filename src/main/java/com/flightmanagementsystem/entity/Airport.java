package com.flightmanagementsystem.entity;

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
@Table(name = "Airport")
public class Airport {

	@Id
<<<<<<< HEAD
	private Integer airportId;
=======
	private Integer airportid;
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	private String airportName;
	private String airportCity;
	private String airportCountry;

}