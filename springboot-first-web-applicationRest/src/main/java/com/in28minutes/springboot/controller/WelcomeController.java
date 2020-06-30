package com.in28minutes.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@Autowired
	WelcomeService service;

	@RequestMapping("/welcome")
	public String welcome() {

		//return "this is welcome message";
		return service.retrieveWelcomeMessage();
	}

	@Service
	public class WelcomeService {
		public String retrieveWelcomeMessage() {

			return "modified welcome message";
		}
	}

}
