package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Project;
import com.example.demo.repositories.ProjectRepository;

@Service
public class ProjectService implements iProjectService {

	@Autowired
	ProjectRepository projectRepo;

	@Override
	public Project createProject(Project project) {
		return projectRepo.save(project);
	}

	@Override
	public List<Project> getProjects(int id) {
		return projectRepo.findByEmployeeId(id);
	}

}
