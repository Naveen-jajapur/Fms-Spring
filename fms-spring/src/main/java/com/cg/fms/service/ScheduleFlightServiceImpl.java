package com.cg.fms.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.dao.FlightDao;
import com.cg.fms.dao.ScheduleDao;
import com.cg.fms.entity.Flight;
import com.cg.fms.entity.Schedule;
import com.cg.fms.exception.ScheduleException;


@Service
public class ScheduleFlightServiceImpl implements ScheduleFlightService{
	
	@Autowired
	ScheduleDao scheduleDao;

	@Autowired
	FlightDao flightDao;
	@Override
	public Schedule findScheduleFlight(int id) throws ScheduleException{
		if(!scheduleDao.existsById(id))
			throw new ScheduleException(" Id not found");
		
		return scheduleDao.findById(id).get();
	}

	@Override
	public List<Schedule> viewAllScheduledFlights() {
		
		return scheduleDao.findAll();
	}

	@Override
	public List<Schedule> findScheduleFlightById(int flightNumber) throws ScheduleException  {
		
		if(!flightDao.existsById(flightNumber))
			throw new ScheduleException(" No flight is present");
		return scheduleDao.findScheduledFlightById(flightNumber);
	}

	@Override
	public Schedule addScheduleFlight(Schedule scheduledFlight) throws ScheduleException {
	List<Schedule> list=	scheduleDao.findScheduledFlight(scheduledFlight.getArrivalDate(), scheduledFlight.getDepartureDate(), scheduledFlight.getFlight().getFlight_number(), scheduledFlight.getArrivalTime(), scheduledFlight.getDepartureTime());
		
		if(list.isEmpty())
		return scheduleDao.saveAndFlush(scheduledFlight);
		else
			throw new ScheduleException(" Flight is already scheduled on given date and time");

	}

	@Override
	public Schedule deleteScheduledFlight(int scheduledFlightId) throws ScheduleException {
		Schedule sch =null;
		if(scheduleDao.existsById(scheduledFlightId)) {
			
		sch= scheduleDao.findById(scheduledFlightId).get();
		scheduleDao.deleteById(scheduledFlightId);}
		else {
			throw new ScheduleException(" No Scheduled Flight is available");
		}
		
		
		return sch;
	}

	@Override
	public List<Schedule> findScheduleFlightByAirport(String source, String dest) throws ScheduleException {
		

		List<Schedule> list =scheduleDao.findScheduledFlightByAirport(source, dest);
		if(list.isEmpty())
			throw new ScheduleException(" No Flights are available");
		return list;
	}


	@Override
	public List<Schedule> findScheduleFlight(LocalDate arrival, LocalDate departure, int fnumber, String atime,
			String dtime) throws ScheduleException {
		
		return scheduleDao.findScheduledFlight(arrival, departure, fnumber, atime, dtime);
	}

	



}
