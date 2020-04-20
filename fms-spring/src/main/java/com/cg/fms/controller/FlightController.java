package com.cg.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.entity.Flight;
import com.cg.fms.entity.Schedule;
import com.cg.fms.service.ScheduleFlightService;

@RestController
@CrossOrigin("*")
public class FlightController {
	
	@Autowired
	ScheduleFlightService service;
	
	@GetMapping("sch_flight/{id}")
	public Schedule findScheduleFlight(@PathVariable("id") int flightNumber) {
		return service.findScheduleFlight(flightNumber);
	}
	
	@GetMapping("sch_flight")
	public List<Schedule> viewAllScheduledFligts() {
		return service.viewAllScheduledFlights();
	}
	

}
