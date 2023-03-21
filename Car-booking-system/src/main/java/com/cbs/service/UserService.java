package com.cbs.service;

import com.cbs.entity.User;
import com.cbs.model.UserDTO;

public interface UserService {

	String createUser(User user);

	UserDTO getUserById(int id);


}
