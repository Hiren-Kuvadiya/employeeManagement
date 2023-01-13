package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Employee;
import com.example.demo.models.Project;
import com.example.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public List<Employee> findAll() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		employee.setTimestamp(String.valueOf(System.currentTimeMillis()));
		return employeeRepo.save(employee);
	}

	/**
	 *
	 */
	@Override
	public Employee updateEmployee(Employee employee) {
		Employee existingRecord = employeeRepo.findById(employee.getId()).orElse(null);
		existingRecord.setName(employee.getName());
		existingRecord.setEmail(employee.getEmail());
		existingRecord.setTimestamp(String.valueOf(System.currentTimeMillis()));
		return employeeRepo.save(existingRecord);
	}

	@Override
	public String deleteEmployee(int id) {
		employeeRepo.deleteById(id);
		return "Employee removed !! " + id;
	}

	@Override
	public List<Project> findEmployeeProjects(int id) {
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) {
		return employeeRepo.findById(id).orElse(null);
	}
}