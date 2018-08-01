package com.tools.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tools.dao.UserDAO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDAO;

	public boolean validateUser(String userId, String password) {
		return userDAO.validateUser(userId,password);
	}

}
