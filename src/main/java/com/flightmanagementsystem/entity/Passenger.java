package com.flightmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Passenger")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Passenger extends User {
	
	private Long passengerUIN;
	private String passengerName;
	private Integer age;
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
	
}
