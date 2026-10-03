package com.ramansh.projects.loveableclone.service;

import com.ramansh.projects.loveableclone.dto.auth.AuthResponse;
import com.ramansh.projects.loveableclone.dto.auth.LoginRequest;
import com.ramansh.projects.loveableclone.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
