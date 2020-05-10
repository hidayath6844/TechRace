package com.techrace.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actuators")
public class ActuatorController {

	
	@GetMapping("/demo")
	public String actuatorDemo()
	{
		return "Actuator demo successfull!!";
	}
}
