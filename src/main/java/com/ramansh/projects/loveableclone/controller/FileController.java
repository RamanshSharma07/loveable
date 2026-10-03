package com.ramansh.projects.loveableclone.controller;

import com.ramansh.projects.loveableclone.dto.project.FileContentResponse;
import com.ramansh.projects.loveableclone.dto.project.FileNode;
import com.ramansh.projects.loveableclone.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/projects/{projectId}/files")
public class FileController {

    private final FileService fileService;

    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTree(
            @PathVariable Long projectId
    ) {
        Long userId = 1L;
        return ResponseEntity.ok(
                fileService.getFileTree(projectId, userId)
        );
    }

    @GetMapping("/{*path}") // we do * path to accept whole path in the request like - src/hooks/Apphook.jsx
    public ResponseEntity<FileContentResponse> getFile(
            @PathVariable Long projectId,
            @PathVariable String path
    ) {
        Long userId = 1L;
        return ResponseEntity.ok(
                fileService.getFileContent(projectId, path, userId)
        );
    }

}
