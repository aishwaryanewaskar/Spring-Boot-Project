package com.cbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cbs.entity.Driver;
import com.cbs.service.DriverService;

@RestController
public class DriverController {

	@Autowired
	private DriverService driverService;
	
	@PostMapping("/createDriver")
	public String createDriver(@RequestBody Driver driver)
	{
		return driverService.createDriver(driver);
		
	}
	
	
}
