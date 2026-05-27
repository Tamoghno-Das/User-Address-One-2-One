package com.example.service;

import com.example.dto.UserssDTO;

import java.util.List;

public interface UserService
{
    UserssDTO saveUser(UserssDTO userssDTO);
    List<UserssDTO> getAllUsers();
    UserssDTO getUserById(Long id);
    UserssDTO updateUser(Long id,UserssDTO userssDTO);
    String deleteUser(Long id);
}
