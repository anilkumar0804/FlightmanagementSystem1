package com.flightmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer airportId;
	@NotBlank(message="Airport name is required")
	private String airportName;
	@NotBlank(message="Airport city is required")
	private String airportCity;
	@NotBlank(message="Airport country is required")
	private String airportCountry;

}