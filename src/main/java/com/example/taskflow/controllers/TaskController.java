package com.example.taskflow.controllers;

import com.example.taskflow.dtos.TaskDTO;
import com.example.taskflow.entities.Task;
import com.example.taskflow.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/task")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @GetMapping
    public List<TaskDTO> findAll() {
        List<TaskDTO> result = taskService.findAll();
        return result;

    }
}