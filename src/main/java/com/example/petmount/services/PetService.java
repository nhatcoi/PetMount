package com.example.petmount.services;

import com.example.petmount.entities.Pet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PetService {
    List<Pet> findAll();
}
