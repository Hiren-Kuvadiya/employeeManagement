package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.models.Project;
import com.example.demo.services.EmployeeService;
import com.example.demo.services.ProjectService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private ProjectService projectService;

	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return "deleted" + id;
	}

	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		System.err.println(employee.getName());
		return employeeService.createEmployee(employee);
	}

	@GetMapping(value = "/employees")
	public List<Employee> getEmployeeList() {
		List<Employee> employeeList = employeeService.findAll();
		return employeeList;
	}

	@GetMapping("/employeeById/{id}")
	public Employee findEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping("/employeeByName/{name}")
	public Employee findEmployeeByName(@PathVariable String name) {
		return employeeService.getEmployeeByName(name);
	}
	
	@GetMapping("/employeeByEmail/{email}")
	public Employee findEmployeeByEmail(@PathVariable String email) {
		return employeeService.getEmployeeByEmail(email);
	}

	@PostMapping("/project")
	public Project createEmployee(@RequestBody Project project) {
		return projectService.createProject(project);
	}

	@GetMapping("/projects/{id}")
	public List<Project> getEmployeeProjects(@PathVariable int id) {
		return projectService.getProjects(id);
	}

}