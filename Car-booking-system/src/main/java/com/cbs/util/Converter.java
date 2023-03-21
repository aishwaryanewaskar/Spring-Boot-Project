package com.cbs.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.cbs.entity.Booking;
import com.cbs.entity.User;
import com.cbs.model.BookingDTO;
import com.cbs.model.UserDTO;

@Component
public class Converter {

	public UserDTO convertEntityToUserDTO(User user)
	{
		UserDTO userDTO = new UserDTO();
		if(user!=null)
		{
			BeanUtils.copyProperties(user, userDTO);
		}
		return userDTO;
	}
	
	public User convertDTOToUser(UserDTO userDTO)
	{
		User user = new User();
		if(userDTO!=null)
		{
			BeanUtils.copyProperties(userDTO, user);
		}
		return user;
	}

	public static UserDTO convertEntityToBookDTO(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public static BookingDTO convertEntityToBookingDTO(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}
}
