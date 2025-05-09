package com.example.petmount.controller;

import com.example.petmount.dto.UserRequest;
import com.example.petmount.dto.UserResponse;
import com.example.petmount.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;
    private final ModelMapper modelMapper;

    @GetMapping("")
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(new UserResponse(userService.getAllUsers().size(), userService.getAllUsers().stream()
                .map(user -> modelMapper.map(user, UserRequest.class))
                .collect(Collectors.toList())));
    }
}
