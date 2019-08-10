/**
 * 
 */
package com.demo.h2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hidayath
 *
 */
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}

}
