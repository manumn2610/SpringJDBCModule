package com.in28minutes.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JqueryTestController {
	
	@RequestMapping("/jqueryTest")
	
	public String jqueryTest() {
		
		return "jqueryTest";
		
	}

}
