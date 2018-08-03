package com.dcfoods.dao;

import org.springframework.data.repository.CrudRepository;

import com.dcfoods.model.Menu;

public interface MenuRepository extends CrudRepository<Menu, Long>{

	Menu findByDay(String day);
	
}
