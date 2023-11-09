package com.flightmanagementsystem.entity;

import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Passenger")

public class Passenger extends User {

=======
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Passenger")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Passenger extends User {
	
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	
	private Long passengerUIN;
	private String passengerName;
	private Integer age;
	
<<<<<<< HEAD
	
=======
	public Long getPassengerUIN() {
		return passengerUIN;
	}
	public void setPassengerUIN(Long passengerUIN) {
		this.passengerUIN = passengerUIN;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Passenger [passengerUIN=" + passengerUIN + ", passengerName=" + passengerName + ", age=" + age + "]";
	}
>>>>>>> 327e3558b30c14cfa0005236aaec72229c86d85d
	
}
