package com.tools.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tools.model.Stock;

@Repository
public class StockDAO {
	
	@Autowired
	protected StockRepository stockRepository;

	public void addItem(Stock stock) {
		stockRepository.save(stock);
	}

	public List<Stock> showAll() {
		return (List<Stock>) stockRepository.findAll();
	}
}
