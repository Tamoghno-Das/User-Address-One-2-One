package com.example.controller;
import com.example.dto.UserssDTO;
import com.example.service.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class UserController {
    private UserService service;
    @PostMapping
    public UserssDTO saveUser(@Valid @RequestBody UserssDTO dto) {

        return service.saveUser(dto);
    }

    @GetMapping
    public List<UserssDTO> getAllUsers() {

        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserssDTO getUserById(@PathVariable Long id) {

        return service.getUserById(id);
    }

    @PutMapping("/{id}")
    public UserssDTO updateUser(@PathVariable Long id,@Valid @RequestBody UserssDTO dto) {

        return service.updateUser(id, dto);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(
            @PathVariable Long id) {

        return service.deleteUser(id);
    }


}