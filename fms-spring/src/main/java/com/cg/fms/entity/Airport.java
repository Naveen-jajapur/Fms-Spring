package com.cg.fms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airport_tbl")
public class Airport {

	@Id
	@Column(name="acode")
	private String airport_code;
	@Column(name="aname")
	private String airport_name;
	@Column(name="alocation")
	private String airport_location;
	

	public String getAirport_code() 
	{
		return airport_code;
	}
	public void setAirport_code(String airport_code) {
		this.airport_code = airport_code;
	}
	public String getAirport_name() {
		return airport_name;
	}
	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}
	public String getAirport_location() {
		return airport_location;
	}
	public void setAirport_location(String airport_location) {
		this.airport_location = airport_location;
	}
	
}
