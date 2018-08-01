package com.tools.dao;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tools.model.User;

@Repository
public class UserDAO {
	protected Logger logger = Logger.getLogger(getClass().getName());
	@Autowired
	protected UserRepository userRepository;

	public boolean validateUser(String userId, String password) {
		
		User user = userRepository.findBy_usrId(userId);

		if (user != null) {
			logger.info("userName...." + user.get_usrName());
			if (user.get_passwd().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
