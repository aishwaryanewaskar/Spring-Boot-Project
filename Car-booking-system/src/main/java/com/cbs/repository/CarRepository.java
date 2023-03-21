package com.cbs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbs.entity.Car;

public interface CarRepository extends JpaRepository<Car,Integer> {

	 List<Car> findBySeatingCapacityAndAvailableForBookingTrue(int Capacity);

	    List<Car> findByIdIn(List<Integer> carIds);
}
