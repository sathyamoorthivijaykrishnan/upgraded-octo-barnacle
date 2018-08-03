package com.dcfoods.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dcfoods.model.Menu;

@Repository
public class MenuDAO {

	@Autowired
	protected MenuRepository menuRepository;

	public List<Menu> getMenuList() {
		List<Menu> menuList = (List<Menu>) menuRepository.findAll();
		System.out.println("MenuList....."+menuList);
		return menuList;
	}

	public Menu getMenuForTheDay(String day) {
		
		Menu menu =  menuRepository.findByDay(day);
		System.out.println("menu....."+menu);
		return menu;

	}

}
