package com.ramansh.projects.loveableclone.controller;

import com.ramansh.projects.loveableclone.dto.auth.AuthResponse;
import com.ramansh.projects.loveableclone.dto.auth.LoginRequest;
import com.ramansh.projects.loveableclone.dto.auth.SignupRequest;
import com.ramansh.projects.loveableclone.dto.auth.UserProfileResponse;
import com.ramansh.projects.loveableclone.service.AuthService;
import com.ramansh.projects.loveableclone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(
            SignupRequest request
    ) {
        return ResponseEntity.ok(
                authService.signup(request)
        );
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(
            LoginRequest request
    ) {
        return ResponseEntity.ok(
                authService.login(request)
        );
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile() {
        Long userId = 1L;
        return ResponseEntity.ok(
                userService.getProfile(userId)
        );
    }
}
