package com.cbs.model;

import java.util.List;

import com.cbs.entity.Booking;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class UserDTO 
{

	private int id;
	private String userName;
	private String password;
	private String role;
	
	@OneToMany
	private List<Booking> booking;
}
