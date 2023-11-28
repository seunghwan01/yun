package com.nowon.cho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/users/login")
	public String login() {
		return "/users/login";
	}
	
	@GetMapping("/users/signup")
	public String signup() {
		return "/users/signup";
	}
	
	@GetMapping("/users/signupagree")
	public String signupagree() {
		return "/users/signupagree";
	}
}
