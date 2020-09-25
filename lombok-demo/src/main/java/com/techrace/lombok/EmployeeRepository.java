/**
 * 
 */
package com.techrace.lombok;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hidayath
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

}
