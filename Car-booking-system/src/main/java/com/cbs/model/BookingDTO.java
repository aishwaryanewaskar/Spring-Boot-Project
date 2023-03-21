package com.cbs.model;

import java.util.List;

import com.cbs.entity.Booking;
import com.cbs.entity.Car;
import com.cbs.entity.Driver;
import com.cbs.entity.User;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class BookingDTO 
{
    
	private int bookingId;
	private String userName;
	private String status;
	
	@ManyToOne
	private User user;
	
	@OneToOne
	private Driver driver;
	
	@OneToOne
	private Car car;
	
}
