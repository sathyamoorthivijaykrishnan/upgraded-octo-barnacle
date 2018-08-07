package com.rate.calculator.controller;

import java.io.File;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayController {

	
	@GetMapping(value = "/rate/dbToFile")
	public File fileToDB(){
		return null;

		
	}

}
