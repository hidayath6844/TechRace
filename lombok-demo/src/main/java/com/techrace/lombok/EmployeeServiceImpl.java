/**
 * 
 */
package com.techrace.lombok;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Hidayath
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository)
	{
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<EmployeeEntity> entityList = employeeRepository.findAll() ;
		List<Employee> employeeList = new ArrayList<>();
		entityList.stream().forEach(e ->{
			Employee employee = new Employee();
			BeanUtils.copyProperties(e, employee);
			employeeList.add(employee);
		});
		return employeeList;
	}

}
