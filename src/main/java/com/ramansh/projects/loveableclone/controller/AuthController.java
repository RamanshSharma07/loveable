package com.ramansh.projects.loveableclone.controller;

import com.ramansh.projects.loveableclone.dto.auth.AuthResponse;
import com.ramansh.projects.loveableclone.dto.auth.LoginRequest;
import com.ramansh.projects.loveableclone.dto.auth.SignupRequest;
import com.ramansh.projects.loveableclone.dto.auth.UserProfileResponse;
import com.ramansh.projects.loveableclone.service.AuthService;
import com.ramansh.projects.loveableclone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(
            @RequestBody SignupRequest request
    ) {
        return ResponseEntity.ok(
                authService.signup(request)
        );
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(
            @RequestBody LoginRequest request
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
