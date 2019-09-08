package com.jm3190810.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String showLoginName() {
		return "login";
	}

	@PostMapping("/login")
	public String processLogin(@RequestParam("email") String email, @RequestParam("password") String pass,
			Model model) {
		System.out.println(email + " " + pass);
		model.addAttribute("email", email);
		return "user-profile";
	}
}
