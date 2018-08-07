package com.rate.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.rate.calculator.dao.RateRepository;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,BatchAutoConfiguration.class})
public class RateCalculatorBatchServiceApplication implements CommandLineRunner{

	
	@Autowired
	protected RateRepository rateRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RateCalculatorBatchServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		rateRepository.deleteAll();		
	}

	

}
