package com.cbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbs.entity.Booking;
import com.cbs.model.BookingDTO;
import com.cbs.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	private BookingService userService;
	
	@PostMapping("/createBooking")
	public String createBooking(@RequestBody Booking booking)
	{
		
		return BookingService.createBooking(booking);
		
	}
	
	@GetMapping("/getBookingById/{id}")
	public BookingDTO getBookingById(@PathVariable("id")int id)
	{
		
		return BookingService.getBookingById(id);
		
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteBookingById(@PathVariable("id")int id)
	{
		return BookingService.deleteBookingById(id);
		
	}
	
	@DeleteMapping("/deleteAllBooking")
	public ResponseEntity<String> deleteAllBooking()
	{
		BookingService.deleteAllBooking();
		return new ResponseEntity<String>("All Booking details got deleted!!",
				HttpStatus.OK);
		
	}
	
	@GetMapping("/getBookingByName/{name}")
	public  List<BookingDTO> getBookingByName(@PathVariable("name") String username)
	{
		return BookingService.getBookingByName(username);
		
	}
	
	@GetMapping("/getBookingByBookingid/{id}")
	public List<BookingDTO> getBookingByBookingid(@PathVariable("id") String bookingid)
	{
		return BookingService.findByBookingId(bookingid);
		
	}
}
