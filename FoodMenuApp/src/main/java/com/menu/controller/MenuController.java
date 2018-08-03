package com.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.menu.service.MenuService;

@Controller
public class MenuController {

	@Autowired
	protected MenuService menuService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHome(ModelMap model) {
		return "home";

	}

	@RequestMapping(value = "/menu/week", method = RequestMethod.GET)
	public ModelAndView getMenuForTheWeek() {
		ModelAndView mav = new ModelAndView("showMenu");
		mav.addObject("menuLst", menuService.getMenuForTheWeek());
		return mav;

	}

	@RequestMapping(value = "/menu/day", method = RequestMethod.GET)
	public ModelAndView getMenuForTheDay() {
		ModelAndView mav = new ModelAndView("showMenu");
		mav.addObject("t_menu", menuService.getMenuForTheDay());
		return mav;
	}

}
