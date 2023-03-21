package com.cbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cbs.entity.User;
import com.cbs.model.UserDTO;
import com.cbs.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/createUser")
	public String createUser(@RequestBody User user)
	{
		return userService.createUser(user);
	}
	
	@GetMapping("/getUserById/{id}")
	public UserDTO getUserById(@PathVariable("id") int id)
	{
		return userService.getUserById(id);
		
	}

}
