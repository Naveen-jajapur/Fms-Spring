package com.cg.fms.entity;

import java.util.List;

public class FlightList {
	
	List<Schedule> list;

	public FlightList(List<Schedule> list) {
		super();
		this.list = list;
	}

	public FlightList() {
		super();
	}

	public List<Schedule> getList() {
		return list;
	}

	public void setList(List<Schedule> list) {
		this.list = list;
	}
	
	
}
