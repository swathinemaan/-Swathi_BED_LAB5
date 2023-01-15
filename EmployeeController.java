package com.greatlearning.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.greatlearning.employeemanagement.model.Employee;
import com.greatlearning.employeemanagement.service.EmployeeServiceInterface;

@Controller
public class EmployeeController {
	
 @Autowired
 EmployeeServiceInterface service;
 
 
 @GetMapping("/employees")
 public String getAllEmployees(Model model)
 {
	 List<Employee> results = service.getAllEmployees();
	 model.addAttribute("employees",results);
	 return "employees";
 }
 
 @GetMapping("/employees/new")
 public String addNewEmployee(Model model)
 {
	 Employee result = new Employee();
	 model.addAttribute("employee",result);
	 return "create_employee";
 }
 
 @GetMapping("/employees/edit/id")
 public String Updatemployee(Model model,@PathVariable("id")int id)
 {
	 Employee result = service.getEmployeebyId(id);
	 model.addAttribute("employee",result);
	 return "edit_employee";
 }
 
 @GetMapping("/employees/delete/id")
 public String DeleteEmployee(@PathVariable("id")int id)
 {
	 service.getEmployeebyId(id);
	 return "redirect:/employees";
 }
 
 
 @PostMapping("/employees/{id}")
 public String saveNewEmployee(@ModelAttribute("employee") Employee emp) {
	 service.SaveorUpdateEmployee(emp);
	 return "redirect:/employees";
 }
 
 @PostMapping("/employees/{id}")
 public String updateEmployee(@ModelAttribute("employee") Employee emp,@PathVariable("id")int id) {
	 Employee existingEmployee = service.getEmployeebyId(id);
	 existingEmployee.setFirstName(emp.getfirstName(id));
	 existingEmployee.setLastName(emp.getlastName(id));
	 existingEmployee.email(emp.getemail(id));
	 
	 service.SaveorUpdateEmployee(emp);
	 return "redirect:/employees";
 }
 
 
 
 
 
}
