package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.services.EmployeeServices;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServices employeeServices;
	
	@PostMapping("/save")
	public Employee create(@RequestBody Employee employee) {
		return employeeServices.create(employee);
	}
	
	@GetMapping("/ReadById/{id}")
	public Employee Read(@PathVariable("id")Long id) {
		return employeeServices.Read(id);
	}
	
	@PutMapping("/update/{id}")
	public Employee Update(@PathVariable("id")Long id,@RequestBody Employee employee) {
		return employeeServices.update(id,employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public String Delete(@PathVariable("id")Long id) {
		return employeeServices.delete(id);
	}

}
