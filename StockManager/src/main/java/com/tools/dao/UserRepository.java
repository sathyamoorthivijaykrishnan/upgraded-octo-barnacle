package com.tools.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tools.model.User;

public interface UserRepository extends CrudRepository<User,Long>  {

	public User findBy_usrId(String userId);
	
	@Query("SELECT count(*) from User")
	public int countUsers();
}
