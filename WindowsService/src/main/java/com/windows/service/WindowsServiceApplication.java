package com.windows.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WindowsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WindowsServiceApplication.class, args);
	}

	@GetMapping("/winService")
	public String windowsService()
	{
		return "Welcome to windows service implementation.";
	}
}
