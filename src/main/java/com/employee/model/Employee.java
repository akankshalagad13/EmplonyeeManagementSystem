package com.employee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Emp_Id;
	
	@Column(name="name")
	private String name;
	
	public Employee(Long emp_Id, String name, String designation, String location, Long salary) {
		Emp_Id = emp_Id;
		this.name = name;
		this.designation = designation;
		this.location = location;
		this.salary = salary;
	}

	public Employee() {
	}

	public Long getEmp_Id() {
		return Emp_Id;
	}

	public void setEmp_Id(Long emp_Id) {
		Emp_Id = emp_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@Column(name="designation")
	private String designation;
	
	@Column(name="location")
	private String location;
	
	@Column(name="salary")
	private Long salary;

}
