package com.cg.fms.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.fms.entity.Flight;
import com.cg.fms.entity.Schedule;
import com.cg.fms.exception.ScheduleException;


public interface ScheduleFlightService {
	
	public Schedule findScheduleFlight(int flightNumber) throws ScheduleException;
	
	public List<Schedule> viewAllScheduledFlights();

	public List<Schedule> findScheduleFlightById(int flightNumber) throws ScheduleException;

	public List<Schedule> findScheduleFlightByAirport(String source, String dest) throws ScheduleException;
	public Schedule addScheduleFlight(Schedule scheduledFlight) throws ScheduleException;
	
	public Schedule deleteScheduledFlight(int scheduledFlightId) throws ScheduleException;
	public List<Schedule> findScheduleFlight(LocalDate arrival,LocalDate departure,int fnumber,String atime,String dtime) throws ScheduleException;


}
