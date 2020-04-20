package com.cg.fms.service;

import java.util.List;

import com.cg.fms.entity.Flight;
import com.cg.fms.entity.Schedule;


public interface ScheduleFlightService {
	
	public Schedule findScheduleFlight(int flightNumber);
	
public List<Schedule> viewAllScheduledFlights();
//	public Schedule find();

}
