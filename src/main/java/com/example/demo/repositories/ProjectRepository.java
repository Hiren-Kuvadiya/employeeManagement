package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.hibernate.integrator.spi.Integrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Employee;
import com.example.demo.models.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

	 List<Project> findByEmployeeId(int employeeId);

}