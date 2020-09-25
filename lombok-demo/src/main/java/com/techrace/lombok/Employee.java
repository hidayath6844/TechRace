package com.techrace.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Hidayath
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private int id;

	private String firstName;

	private String lastName;

	private String role;

}
