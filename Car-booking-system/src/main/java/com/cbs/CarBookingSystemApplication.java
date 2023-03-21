package com.cbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CarBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarBookingSystemApplication.class, args);
		System.out.println("Cab Booking system launched!!");
	}

}
