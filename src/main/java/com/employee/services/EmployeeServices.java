package com.employee.services;

import com.employee.model.Employee;

public interface EmployeeServices  {

	Employee create(Employee employee);

	Employee Read(Long id);

	Employee update(Long id, Employee employee);

	String delete(Long id);


}
