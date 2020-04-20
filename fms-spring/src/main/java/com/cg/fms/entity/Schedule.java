package com.cg.fms.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="schedule_tbl")
public class Schedule {
	@Id
	@Column(name="sch_id")
	private int scheduleId;
	@ManyToOne
	@JoinColumn(name="sairport")
	private Airport sourceAirport;
	
	@ManyToOne
	@JoinColumn(name="dairport")
	private Airport destAirport;
	
	@Column(name="arr_dat_time")
	private LocalDate arrivalDate;
	@Column(name="dept_dat_time")
	private LocalDate departureDate;
	
	
	@ManyToOne
	@JoinColumn(name="fnumber")
	private Flight flightNumber;
	

}
