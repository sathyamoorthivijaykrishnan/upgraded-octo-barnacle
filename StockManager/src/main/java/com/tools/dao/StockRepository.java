package com.tools.dao;

import org.springframework.data.repository.CrudRepository;

import com.tools.model.Stock;

public interface StockRepository extends CrudRepository<Stock, Long>{
	

}
