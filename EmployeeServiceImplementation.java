package com.greatlearning.employeemanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagement.repository.EmployeeRepository;
import com.greatlearning.employeemanagement.model.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeServiceInterface {

	//all methods are in built of jpa
	EmployeeRepository repository;
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
	}

	@Override
	public void SaveorUpdateEmployee(Employee emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void DeleteEmployee(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployeebyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
