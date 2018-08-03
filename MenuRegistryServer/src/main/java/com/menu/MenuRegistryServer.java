package com.menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MenuRegistryServer {
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "menu-server");

		SpringApplication.run(MenuRegistryServer.class, args);
	}
}

