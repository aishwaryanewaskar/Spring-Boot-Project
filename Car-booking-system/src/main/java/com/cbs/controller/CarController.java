package com.cbs.controller;

import java.util.Collection;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cbs.entity.Car;
import com.cbs.repository.CarRepository;
import com.cbs.repository.DriverRepository;
import com.cbs.service.CarService;

@RestController
public class CarController {

	@Autowired
	private CarService carService;
	
	@PostMapping("/createCar")
	public String createCar(@RequestBody Car car)
	{
		return carService.createCar(car);
		
	}
	
	 @Autowired
	 private CarRepository carRepository;
	   
	 @Autowired
	 private DriverRepository driverRepository;

	  @RequestMapping("/list-cars")
	  public String listAllCars(ModelMap modelMap) {
	        List cars=(List) carRepository.findAll();
	        modelMap.put("cars",cars);
	        return "listCars";
	    }
	  
	  @RequestMapping("/list-available-cars")
	    public String listAllAvailableCarsForBooking(@RequestParam int seatingCapacity,ModelMap modelMap) {
	    Collection<Car> cars=carRepository.findBySeatingCapacityAndAvailableForBookingTrue(seatingCapacity);
	        modelMap.put("cars",cars);
	        return "listCarsAvailableForBooking";
	    }

	    @RequestMapping(value="add-car",method= RequestMethod.GET)
	    public String showNewCarPage(Car car) {
	        return "car";
	    }
	    
	    @RequestMapping(value="delete-car")
	    public String deleteCar(@RequestParam int id) {
	        carRepository.deleteById(id);
	        return "redirect:list-cars";
	    }

}
