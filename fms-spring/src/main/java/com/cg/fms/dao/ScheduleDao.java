package com.cg.fms.dao;



import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.cg.fms.entity.Schedule;
import com.cg.fms.exception.ScheduleException;

@Repository
public interface ScheduleDao extends JpaRepository<Schedule, Integer>{
	
	@Query(" FROM Schedule  where flight.flight_number=:x")
	public List<Schedule> findScheduledFlightById(@Param("x")int id); 
	
	@Query(" FROM Schedule  where sourceAirport.airport_code=:source and destAirport.airport_code=:dest")
	public List<Schedule> findScheduledFlightByAirport(@Param("source")String source,@Param("dest")String dest); 
	
	@Query(" From Schedule where arrivalDate=:arrival and departureDate=:departure and flight.flight_number=:fnumber and arrivalTime=:atime and departureTime=:dtime")
	public List<Schedule> findScheduledFlight(@Param("arrival") LocalDate arrival ,@Param("departure") LocalDate departure,@Param("fnumber") int fnumber, @Param("atime") String atime, @Param("dtime") String dtime );;
	
	
	

}
