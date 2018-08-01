package com.tools.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tools.model.Stock;
import com.tools.service.StockService;

@Controller
public class UpdateController {
	
	@Autowired
	protected StockService stockService;
	
	@RequestMapping(value="/addStock",method = RequestMethod.GET)
	public ModelAndView addStockPage(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView model = new ModelAndView("addStock");
		model.addObject("stock", new Stock());
		return model;
		
	}
	@RequestMapping(value="/addStock",method = RequestMethod.POST)
	public String addStock(HttpServletRequest request,HttpServletResponse response, @ModelAttribute("stock") Stock stock) {
		stockService.addItem(stock);
		return "redirect:/showStock";
		
		
	}
	@RequestMapping(value="/showStock",method = RequestMethod.GET)
	public ModelAndView showStock() {
		List<Stock> allStocks = stockService.showAllStock();
		ModelAndView model = new ModelAndView("showStock");
		model.addObject("allStocks", allStocks);
		return model;

	}


}
