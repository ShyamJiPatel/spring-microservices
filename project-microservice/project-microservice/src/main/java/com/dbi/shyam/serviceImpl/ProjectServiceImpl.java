package com.dbi.shyam.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbi.shyam.dao.ProjectRepository;
import com.dbi.shyam.model.Project;
import com.dbi.shyam.service.ProjectService;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	public Project findById(Long id) {
		return projectRepository.findOne(id);
	}

	public void saveProject(Project project) {
		projectRepository.save(project);
	}

	public void updateProject(Project project) {
		Project oldProjet = projectRepository.findOne(project.getId());

		oldProjet.setName(project.getName());
		oldProjet.setDescription(project.getDescription());

		projectRepository.saveAndFlush(oldProjet);
	}

	public void deleteProjectById(Long id) {
		projectRepository.delete(id);
	}

	public Iterable<Project> findAllProjects() {
		return projectRepository.findAll();
	}

	public void deleteAllProjects() {
		projectRepository.deleteAll();
	}

	public boolean isProjectExist(Long id) {
		return projectRepository.exists(id);
	}
}
