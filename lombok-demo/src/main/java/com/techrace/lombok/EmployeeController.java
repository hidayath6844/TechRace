/**
 * 
 */
package com.techrace.lombok;

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
	
	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService)
	{
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}

}
