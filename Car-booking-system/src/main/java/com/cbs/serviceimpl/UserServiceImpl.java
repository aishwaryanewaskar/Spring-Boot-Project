package com.cbs.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbs.entity.User;
import com.cbs.model.UserDTO;
import com.cbs.repository.UserRepository;
import com.cbs.service.UserService;
import com.cbs.util.Converter;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public String createUser(User user) {
		String msg = null;
		
		userRepository.save(user);
		
		if(user!=null)
		{
			msg = "User details saved!";
		}
		return msg;
	}
	
	public UserDTO getUserById(int id)
	{
		User user = userRepository.findById(id).get();
		
		return Converter.convertEntityToBookDTO(user);
		
	}

}
