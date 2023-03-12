package com.employee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepo;


@Service
public class EmployeeServicesImpl implements EmployeeServices{

	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public Employee create(Employee employee) {
		
		Employee employee1=employeeRepo.save(employee);
		return employee1;
	}

	@Override
	public Employee Read(Long id) {
		return employeeRepo.findById(id).get();
	}

	@Override
	public Employee update(Long id, Employee employee) {
		Employee emp=employeeRepo.findById(id).get();
		emp.setName(employee.getName());
		emp.setDesignation(employee.getDesignation() );
		emp.setLocation(employee.getLocation());
		emp.setSalary(employee.getSalary());
		return employeeRepo.save(emp);
	}

	@Override
	public String delete(Long id) {
		employeeRepo.deleteById(id);
		return "employee id"+id+"deleted from database";
		
	}

	

}
