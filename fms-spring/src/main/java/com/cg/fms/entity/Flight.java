package com.cg.fms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flightt")
public class Flight {
	
	@Id
	@Column(name="fnumber")
	private int flight_number;
	@Column(name="fmodel")
	private String flight_model;
	@Column(name="carrier_name")
	private String carrier_name;
	@Column(name="seat_capacity")
	private int seat_capacity;
	public int getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(int flight_number) {
		this.flight_number = flight_number;
	}
	public String getFlight_model() {
		return flight_model;
	}
	public void setFlight_model(String flight_model) {
		this.flight_model = flight_model;
	}
	public String getCarrier_name() {
		return carrier_name;
	}
	public void setCarrier_name(String carrier_name) {
		this.carrier_name = carrier_name;
	}
	public int getSeat_capacity() {
		return seat_capacity;
	}
	public void setSeat_capacity(int seat_capacity) {
		this.seat_capacity = seat_capacity;
	}
	

}
