package com.techrace.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Hidayath
 *
 */

@Table(name = "employee")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {

	@Id
	@GeneratedValue
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "role")
	private String role;

}
