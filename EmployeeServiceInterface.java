package com.greatlearning.employeemanagement.service;

import java.util.List;

import com.greatlearning.employeemanagement.model.Employee;

public interface EmployeeServiceInterface {
	
	public List<Employee> getAllEmployees();
	
	public void SaveorUpdateEmployee(Employee emp);
	
	public void DeleteEmployee(int id);
	
	public Employee getEmployeebyId(int id );

}

