package com.example.petmount.controlles;

import com.example.petmount.dtos.PetDTO;
import com.example.petmount.services.PetService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/pets")
public class PetController {

    private final PetService petService;
    private final ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<?> getAllPets() {
        return ResponseEntity.ok().body(
                petService.findAll().stream()
                .map(pet -> modelMapper.map(pet, PetDTO.class))
        );
    }
}
