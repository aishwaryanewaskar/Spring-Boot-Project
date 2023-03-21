package com.cbs.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbs.entity.Car;
import com.cbs.repository.CarRepository;
import com.cbs.service.CarService;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository carRepository;
	
	public String createCar(Car car)
	{
		String msg=null;
		
		carRepository.save(car);
		
		if(car!=null)
		{
			msg = "Car details saved!!!";
		}
		return msg;
		
	}
}
