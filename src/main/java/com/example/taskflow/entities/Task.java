package com.example.taskflow.entities;

import com.example.taskflow.enums.Priority;
import com.example.taskflow.enums.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task {
    private Long id;
    private String titulo;
    private String descricao;
    private Status status;
    private Priority priority;
    private LocalDateTime dueDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
