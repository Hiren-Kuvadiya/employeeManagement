package com.example.demo.services;
import java.util.List;

import com.example.demo.models.Project;

public interface iProjectService {
	Project createProject(Project project);
	List<Project> getProjects(int id);
}
