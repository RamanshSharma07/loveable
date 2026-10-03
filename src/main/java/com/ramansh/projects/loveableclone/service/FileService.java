package com.ramansh.projects.loveableclone.service;

import com.ramansh.projects.loveableclone.dto.project.FileContentResponse;
import com.ramansh.projects.loveableclone.dto.project.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
