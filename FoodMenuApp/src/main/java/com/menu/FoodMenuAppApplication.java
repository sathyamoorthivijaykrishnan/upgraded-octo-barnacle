package com.menu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.menu.service.MenuService;

@EnableEurekaClient
@SpringBootApplication
@ComponentScan("com.menu")

public class FoodMenuAppApplication {

	
	private String DC_FOODS_SERVICE = "http://DC-FOODS-SERVICE";

	public static void main(String[] args) {
		SpringApplication.run(FoodMenuAppApplication.class, args);
	}
	
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	public MenuService menuService() {
		return new MenuService(DC_FOODS_SERVICE);
	}

}
