package com.cbs.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbs.entity.Driver;
import com.cbs.repository.DriverRepository;
import com.cbs.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverRepository driverRepository;
	
	public String createDriver(Driver driver)
	{
		String msg=null;
		
		driverRepository.save(driver);
		
		if(driver!=null)
		{
			msg= "Driver Details Saved!!";
		}
		return msg;
	}
	
}
