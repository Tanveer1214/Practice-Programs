package com.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpController {

	@GetMapping("/signup")
	public String SignUp() {
		return "signupform";
	}
	
}
