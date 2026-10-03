package com.ramansh.projects.loveableclone.service;

import com.ramansh.projects.loveableclone.dto.project.ProjectRequest;
import com.ramansh.projects.loveableclone.dto.project.ProjectResponse;
import com.ramansh.projects.loveableclone.dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
