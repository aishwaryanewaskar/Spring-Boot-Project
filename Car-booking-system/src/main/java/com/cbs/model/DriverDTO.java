package com.cbs.model;

import com.cbs.entity.Car;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;

public class DriverDTO 
{

	private int driverId;
	private String userName;
	private String password;
	
	@OneToOne
	private Car car;
}
