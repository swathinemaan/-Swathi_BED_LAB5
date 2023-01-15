package com.greatlearning.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeemanagement.model.*;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
