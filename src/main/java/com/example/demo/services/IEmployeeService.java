package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Employee;
import com.example.demo.models.Project;

public interface IEmployeeService {
	
	Employee createEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	Employee getEmployeeById(int id);
	Employee getEmployeeByName(String name);
	Employee getEmployeeByEmail(String email);
	String deleteEmployee(int id);
	List<Employee> findAll();
	List<Project> findEmployeeProjects(int id);
	
}