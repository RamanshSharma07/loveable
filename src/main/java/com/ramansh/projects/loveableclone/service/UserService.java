package com.ramansh.projects.loveableclone.service;

import com.ramansh.projects.loveableclone.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
