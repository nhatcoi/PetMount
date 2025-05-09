package com.example.petmount.service;

import com.example.petmount.entity.User;
import com.example.petmount.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository petRepository;

    @Override
    public List<User> findAll() {
        return petRepository.findAll();
    }
}