package com.tools;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

import com.tools.dao.UserRepository;

@org.springframework.boot.autoconfigure.SpringBootApplication
@ComponentScan("com.tools")
public class SpringBootApplication{
	@Autowired
	protected UserRepository userRepository;
	@Autowired
    DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}
	

}
