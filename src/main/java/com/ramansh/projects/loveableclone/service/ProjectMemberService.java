package com.ramansh.projects.loveableclone.service;

import com.ramansh.projects.loveableclone.dto.member.InviteMemberRequest;
import com.ramansh.projects.loveableclone.dto.member.MemberResponse;
import com.ramansh.projects.loveableclone.dto.member.UpdateRoleRequest;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateRoleRequest request, Long userId);

    MemberResponse deleteMemberRole(Long projectId, Long memberId, Long userId);
}
