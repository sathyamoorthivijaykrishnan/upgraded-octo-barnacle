package com.dcfoods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcfoods.dao.MenuDAO;
import com.dcfoods.model.Menu;

@RestController
public class MenuService {

	@Autowired
	protected MenuDAO menuDAO;

	@RequestMapping(value = "/menu/menuList")
	public List<Menu> getMenuList() {
		System.out.println("called from getMenuforTheWeek");

		return menuDAO.getMenuList();
	}

	@RequestMapping(value = "/menu/{day}")
	public Menu getMenuforTheDay(@PathVariable("day") String day)

	{
		System.out.println("called from getMenuforTheDay");

		return menuDAO.getMenuForTheDay(day);
	}

}
