package com.learning.springboot.sda.service;

import com.learning.springboot.sda.entity.Project;
import com.learning.springboot.sda.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Transactional
    public Optional<Project> getProjectById(Integer id) {
        return projectRepository.findById(id);
    }

    @Transactional
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    @Transactional
    public Project getEntityById(Integer id) {
        return projectRepository.getOne(id);
    }

    @Transactional
    public List<Project> getAllEntities() {
        return projectRepository.findAll();
    }
}
