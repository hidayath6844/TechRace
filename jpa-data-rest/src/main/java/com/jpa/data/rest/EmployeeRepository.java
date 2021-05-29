package com.jpa.data.rest;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "employee")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

    List<Employee> findByLastName(@Param("lastName") String lastName);

    List<Employee> findByFirstName(@Param("firstName") String firstName);

    List<Employee> findByRole(@Param("role") String role);

    // URLs to test this application
    /*
    http://localhost:9005/employee
    http://localhost:9005/employee/1
    http://localhost:9005/employee/search/findByFirstName?firstName=MS
    http://localhost:9005/employee/search/findByLastName?lastName=Dhoni
    http://localhost:9005/employee/search/findByRole?role=Wicket%20Keeper

    Pagination
    http://localhost:9005/employee/?size=2
    http://localhost:9005/employee/?page=0&size=2

     */
}
