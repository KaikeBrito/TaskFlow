package com.example.taskflow.controllers;

import com.example.taskflow.dtos.UserDTO;
import com.example.taskflow.entities.User;
import com.example.taskflow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> findAll(){
        List<UserDTO> result = userService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public UserDTO findById(@PathVariable Long id){
        return userService.findById(id);
    }
}
