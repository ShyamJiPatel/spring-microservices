package com.dbi.shyam.service;

import com.dbi.shyam.model.Project;

public interface ProjectService {

	Project findById(Long id);

	void saveProject(Project project);

	void updateProject(Project project);

	void deleteProjectById(Long id);

	Iterable<Project> findAllProjects();

	void deleteAllProjects();

	boolean isProjectExist(Long id);

}
