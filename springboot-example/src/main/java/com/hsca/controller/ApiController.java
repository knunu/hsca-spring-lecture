package com.hsca.controller;

import com.hsca.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@GetMapping("/test-user")
	public User getTestUser() {
		return new User("test@gmail.com", "테스트");
	}
}
