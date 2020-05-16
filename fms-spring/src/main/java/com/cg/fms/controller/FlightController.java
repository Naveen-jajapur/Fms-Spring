package com.cg.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.entity.FlightList;
import com.cg.fms.entity.Schedule;
import com.cg.fms.exception.ScheduleException;
import com.cg.fms.service.ScheduleFlightService;

@RestController
@CrossOrigin("*")
public class FlightController {
	
	@Autowired
	ScheduleFlightService service;
	
	
	@GetMapping("sch_flight/{id}")
	public ResponseEntity<Schedule> findScheduleFlight(@PathVariable("id") int flightNumber) throws ScheduleException {
		Schedule sch= service.findScheduleFlight(flightNumber);
		
		ResponseEntity<Schedule>  re = new ResponseEntity<Schedule>(sch,HttpStatus.OK);
		return re;
	}
	
	@GetMapping("sch_flight")
	public ResponseEntity<List<Schedule>> viewAllScheduledFligts() {
		List<Schedule> list = service.viewAllScheduledFlights();
		ResponseEntity<List<Schedule>>  re = new ResponseEntity<List<Schedule>>(list,HttpStatus.OK);
		return re;
		
	}
	
	@GetMapping("sch_flight/flight/{id}")
	public ResponseEntity<List<Schedule>> findScheduleFlightById(@PathVariable("id") int flightNumber) throws ScheduleException{
		List<Schedule> sch= service.findScheduleFlightById(flightNumber);
		ResponseEntity<List<Schedule>>  re = new ResponseEntity<List<Schedule>>(sch,HttpStatus.OK);
		return re;
	}
	
	@PostMapping("sch_flight")
	public ResponseEntity<Schedule> addScheduledFlight(@RequestBody Schedule scheduledFlight) throws ScheduleException{
		Schedule sch =service.addScheduleFlight(scheduledFlight);
		ResponseEntity<Schedule>  re = new ResponseEntity<Schedule>(sch,HttpStatus.OK);
		return re;
		}
	
	
	@DeleteMapping("sch_flight/{id}")
	public ResponseEntity<Schedule> deleteScheduledFlight(@PathVariable("id") int scheduledFlightId) throws ScheduleException {
		ResponseEntity<Schedule> re = null;
		Schedule sch =service.deleteScheduledFlight(scheduledFlightId);
		 re = new ResponseEntity<Schedule>(sch,HttpStatus.OK);
		return re;
	}
	
	@GetMapping("sch_flight/{source}/{dest}")
	public ResponseEntity<List<Schedule>> findScheduleFlightByAirport(@PathVariable("source") String source,@PathVariable("dest") String dest) throws ScheduleException{
		List<Schedule> sch= service.findScheduleFlightByAirport(source, dest);
		ResponseEntity<List<Schedule>>  re = new ResponseEntity<List<Schedule>>(sch,HttpStatus.OK);
		return re;
	}
	
	
	
	@GetMapping("sch_flights")
	public ResponseEntity<FlightList> viewAllScheduledFligtsRest() {
		List<Schedule> list = service.viewAllScheduledFlights();
		FlightList flightList = new FlightList(list);
		ResponseEntity<FlightList>  re = new ResponseEntity<FlightList>(flightList,HttpStatus.OK);
		return re;
		
	}
	
	
		

}
