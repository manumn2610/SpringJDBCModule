package com.example.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Component
@RequestMapping("/employee")
@RestController
public class HRApplicationController {

	
@RequestMapping(path="/details")
public String getEmployeeInfo() {
	
	System.out.println("Testing Application***************");
	
	return "Testing Application***************";
}
}
