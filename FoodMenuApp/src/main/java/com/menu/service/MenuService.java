package com.menu.service;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.menu.model.Menu;

@Service
public class MenuService {

	protected String serviceName;

	@LoadBalanced
	@Autowired
	protected RestTemplate restTemplate;

	public MenuService(String serviceName) {
		super();
		this.serviceName = serviceName;
	}

	public List<Menu> getMenuForTheWeek() {
		System.out.println("calling microservice.....from getMenuforTheWeek");
		Menu menuArr[];
		menuArr = restTemplate.getForObject(serviceName + "/menu/menuList", Menu[].class);
		System.out.println("menuArr....."+menuArr);

		if (menuArr == null || menuArr.length == 0)
			return null;
		else
			return Arrays.asList(menuArr);
	}

	public Menu getMenuForTheDay() {
		System.out.println("calling microservice.....from getMenuforTheDay");

		Date now = new Date();
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
		System.out.println("Today....."+ simpleDateformat.format(now).toUpperCase());
		Menu menu = restTemplate.getForObject(serviceName + "/menu/{day}", Menu.class, simpleDateformat.format(now).toUpperCase());
		System.out.println("menu....."+menu);

		return menu;

	}

}
