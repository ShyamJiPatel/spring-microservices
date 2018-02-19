package com.dbi.shyam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbi.shyam.model.Project;

@Repository("projectRepository")
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
