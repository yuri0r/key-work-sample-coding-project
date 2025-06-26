package de.keywork.backend.controller;

import de.keywork.backend.dto.UserDto;
import de.keywork.backend.entity.User;
import de.keywork.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
// @RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;
    // private final AuthenticationManager authManager;

    @PostMapping("/register")
    public Long register(@RequestBody UserDto dataDto) {
        return userService.registerUser(dataDto);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserDto dataDto) {
        userService.authenticate(dataDto);
        return "Login successful";
    }
}
