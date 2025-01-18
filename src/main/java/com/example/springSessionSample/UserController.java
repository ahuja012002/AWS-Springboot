package com.example.springSessionSample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	
    @GetMapping(value = "/users")
	 public User getUsers() {
		 User user = new User("Samuel","India");
		 return user;
		 
	 }
}
