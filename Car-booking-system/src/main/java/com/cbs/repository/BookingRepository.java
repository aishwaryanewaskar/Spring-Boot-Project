package com.cbs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.cbs.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> 
{
	List<Booking> finalByBookingName(@Param("c") String userName);
	
	List<Booking> findByBookingId(String Bookingid);

}
