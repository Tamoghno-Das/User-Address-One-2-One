package com.example.service.impl;

import com.example.dto.UserssDTO;
import com.example.entity.Userss;
import com.example.exception.UserNotFoundException;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserServiceImpl implements UserService
{
    private UserRepository userRepository;
    private ModelMapper modelMapper;

    @Override
    public UserssDTO saveUser(UserssDTO userssDTO) {
        Userss userss = modelMapper.map(userssDTO,Userss.class);
        Userss saved = userRepository.save(userss);
        return modelMapper.map(saved,UserssDTO.class);
    }

    @Override
    public List<UserssDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(userss -> modelMapper.map(userss,UserssDTO.class))
                .toList();

    }

    @Override
    public UserssDTO getUserById(Long id) {
        Userss userss = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
        return modelMapper.map(userss, UserssDTO.class);


    }

    @Override
    public UserssDTO updateUser(Long id, UserssDTO userssDTO)
    {
        Userss existingUser = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));

        existingUser.setFullname(userssDTO.getFullname());
        existingUser.setEmail(userssDTO.getEmail());
        existingUser.setPhone(userssDTO.getPhone());
        existingUser.setAge(userssDTO.getAge());
        existingUser.getAddress().setCity(userssDTO.getAddress().getCity());
        existingUser.getAddress().setState(userssDTO.getAddress().getState());

        Userss updatedUser = userRepository.save(existingUser);
        return modelMapper.map(updatedUser, UserssDTO.class);
    }

    @Override
    public String deleteUser(Long id)
    {
            Userss u = userRepository.findById(id)
                    .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
            userRepository.delete(u);
            return "user deleted with the id of:  "+id;

    }
}
