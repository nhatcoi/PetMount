package com.example.petmount.services;

import com.example.petmount.entities.Pet;
import com.example.petmount.repositories.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;

    @Override
    public List<Pet> findAll() {
        return petRepository.findAll();
    }
}