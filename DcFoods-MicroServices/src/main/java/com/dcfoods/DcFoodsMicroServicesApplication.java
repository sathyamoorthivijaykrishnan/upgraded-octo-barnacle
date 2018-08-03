package com.dcfoods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.dcfoods")
@EnableDiscoveryClient
@SpringBootApplication
public class DcFoodsMicroServicesApplication {

	public static void main(String[] args) {
		
		System.setProperty("spring.config.name", "dc-foods-server");

		SpringApplication.run(DcFoodsMicroServicesApplication.class, args);
	}
}
