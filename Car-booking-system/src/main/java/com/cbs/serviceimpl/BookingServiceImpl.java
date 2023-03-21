package com.cbs.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbs.entity.Booking;
import com.cbs.exception.ResourceNotFoundException;
import com.cbs.model.BookingDTO;
import com.cbs.repository.BookingRepository;
import com.cbs.service.BookingService;
import com.cbs.util.Converter;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	
	public String createBooking(Booking booking)
	{
		String msg=null;
		
		bookingRepository.save(booking);
		
		if(booking!=null)
		{
			msg= "Booking details Saved!";
		}
		return msg;
		
	}
	
	
	public BookingDTO getBookingById(int id)
	{
		Booking booking= bookingRepository.findById(id).get();
		
		return Converter.convertEntityToBookingDTO(booking);
		
	}
	
	public List<BookingDTO> getAllBooking()
	{
		List<Booking> booking= bookingRepository.findAll();
		List<BookingDTO> bookingDTO = new ArrayList<>();
		for(Booking b:booking)
		{
			bookingDTO.add(Converter.convertEntityToBookingDTO(b));
		}
		return bookingDTO;
		
	}


	@Override
	public BookingDTO updateBooking(int id, Booking booking) {
		Booking existingBooking = bookingRepository.findById(id).get();
		
		bookingRepository.save(existingBooking);
		
		return Converter.convertEntityToBookingDTO(existingBooking);
	}


	public String deleteBookingById(int id)  throws ResourceNotFoundException 
	{
		String msg=null;
		Object booking= bookingRepository.findById(id);
		if(((java.util.Optional<Booking>) booking).isPresent())
		{
			bookingRepository.deleteById(id);
			msg= "Booking deleted Successfully!!!";
		}
		else
		{
			throw new ResourceNotFoundException("Booking","Id",id);
		}
		return msg;
	}


	public void deleteAllBooking()
	{
		bookingRepository.deleteAll();
		
	}


	public List<BookingDTO> getBookingByName(String userName) 
	{
		List<Booking> booking= bookingRepository.finalByBookingName(userName);
		List<BookingDTO> bookingDTO = new ArrayList<>();
		for(Booking b: booking)
		{
			bookingDTO.add(Converter.convertEntityToBookingDTO(b));
		}
		return bookingDTO;
	}


	
	public List<BookingDTO> findByBookingId(String bookingid) {
		List<Booking> booking1= bookingRepository.findByBookingId(bookingid);
		List<BookingDTO> bookingDTO = new ArrayList<>();
		for(Booking b: booking1)
		{
			bookingDTO.add(Converter.convertEntityToBookingDTO(b));
		}
		
		return bookingDTO;
		
	}
	
	
	
	
}
