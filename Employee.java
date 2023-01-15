package com.greatlearning.employeemanagement.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "employees")
@Getter
@Setter

public class Employee {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "emp_id")
  private int Id;
  @Column(name = "emp_first_name")
  private String firstName;
  @Column(name = "emp_last_name")
  private String lastName;
  @Column(name = "emp_email")
  private String email;

}

