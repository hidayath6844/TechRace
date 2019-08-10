package com.example.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to Spring boot world.";
	}
	
	@GetMapping("getEmployee")
	public Employee getEmployee()
	{
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Peter");
		return emp;
	}
}
