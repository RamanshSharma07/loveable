package com.ramansh.projects.loveableclone.controller;

import com.ramansh.projects.loveableclone.dto.member.InviteMemberRequest;
import com.ramansh.projects.loveableclone.dto.member.MemberResponse;
import com.ramansh.projects.loveableclone.dto.member.UpdateRoleRequest;
import com.ramansh.projects.loveableclone.service.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/projects/{projectId}/members")
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;

    @GetMapping
    public ResponseEntity<List<MemberResponse>> getProjectMembers(
            @PathVariable Long projectId
    ) {
        Long userId = 1L;
        return ResponseEntity.ok(
                projectMemberService.getProjectMembers(projectId, userId)
        );
    }

    @PostMapping
    public ResponseEntity<MemberResponse> inviteMember (
            @PathVariable Long projectId,
            @RequestBody InviteMemberRequest request
    ) {
        Long userId = 1L;
        return ResponseEntity
                .status(
                        HttpStatus.CREATED
                )
                .body(
                        projectMemberService.inviteMember(projectId, request, userId)
                );
    }

    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateMemberRole(
            @PathVariable Long projectId,
            @PathVariable Long memberId,
            @RequestBody UpdateRoleRequest request
    ) {
        Long userId = 1L;
        return ResponseEntity.ok(
                projectMemberService.updateMemberRole(projectId, memberId, userId)
        );
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<MemberResponse> deleteMemberRole(
            @PathVariable Long projectId,
            @PathVariable Long memberId
    ) {
        Long userId = 1L;
        return ResponseEntity.ok(
                projectMemberService.deleteMemberRole(projectId, memberId, userId)
        );
    }
}
