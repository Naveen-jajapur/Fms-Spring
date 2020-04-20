package com.cg.fms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.dao.FlightDao;
import com.cg.fms.entity.Flight;
import com.cg.fms.entity.Schedule;


@Service
public class ScheduleFlightServiceImpl implements ScheduleFlightService{
	
	@Autowired
	FlightDao flightDao;

	@Override
	public Schedule findScheduleFlight(int flightNumber) {
		
		return flightDao.findById(flightNumber).get();
	}

	@Override
	public List<Schedule> viewAllScheduledFlights() {
		// TODO Auto-generated method stub
		return flightDao.findAll();
	}

//	@Override
//	public List<Flight> viewALlScheduledFlights() {
//		
//		return flightDao.findAll();
//	}
//
//	@Override
//	public Schedule find() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
