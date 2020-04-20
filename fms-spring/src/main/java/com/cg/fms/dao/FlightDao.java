package com.cg.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entity.Flight;
import com.cg.fms.entity.Schedule;

@Repository
public interface FlightDao extends JpaRepository<Schedule, Integer>{
	

}
