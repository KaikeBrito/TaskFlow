package com.example.taskflow.services;

import com.example.taskflow.dtos.TaskDTO;
import com.example.taskflow.entities.Task;
import com.example.taskflow.repositories.TaskRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Transactional
    public List<TaskDTO> findAll() {
        List<Task> result = taskRepository.findAll();
        return result.stream().map(TaskDTO::new).toList();

    }

}
