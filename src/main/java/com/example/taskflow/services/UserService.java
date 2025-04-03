package com.example.taskflow.services;

import com.example.taskflow.dtos.UserDTO;
import com.example.taskflow.entities.User;
import com.example.taskflow.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<UserDTO> findAll(){
        List<User> result = userRepository.findAll();
        return result.stream().map(UserDTO::new).toList();
    }

    @Transactional
    public UserDTO findById(Long id){
        User result = userRepository.findById(id).get();
        return new UserDTO(result);
    }
}
