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
@RequestMapping("/api/pets")
public class PetController {

    private final UserService petService;
    private final ModelMapper modelMapper;

    @GetMapping("")
    public ResponseEntity<?> getAllPets() {
        return ResponseEntity.ok(new UserResponse(petService.findAll().size(), petService.findAll().stream()
                .map(pet -> modelMapper.map(pet, UserRequest.class))
                .collect(Collectors.toList())));
    }
}
