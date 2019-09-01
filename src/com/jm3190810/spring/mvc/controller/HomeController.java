package com.jm3190810.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping(path = "/")
	public String showHomePage() {
		System.out.println("Welcome...");
		return "index";
	}

	@GetMapping(path = "/contact-us")
	public String contactUs() {
		System.out.println("Welcome...");
		return "contact-us";
	}

	@GetMapping("/greet-me")
	public @ResponseBody String greetMe() {
		return "Good Morning!";
	}

}
