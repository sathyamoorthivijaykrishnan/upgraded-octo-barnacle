package com.tools.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tools.dao.StockDAO;
import com.tools.model.Stock;

@Service
public class StockService {

	@Autowired
	protected StockDAO stockDAO;

	public void addItem(Stock stock) {
		stockDAO.addItem(stock);

	}

	public List<Stock> showAllStock() {
		return stockDAO.showAll();

	}

}
