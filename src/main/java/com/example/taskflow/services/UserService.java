package com.example.taskflow.services;

import com.example.taskflow.dtos.UserDTO;
import com.example.taskflow.entities.User;
import com.example.taskflow.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<UserDTO> findAll(){
        List<User> result = userRepository.findAll();
        return result.stream().map(UserDTO::new).toList();
    }

}
