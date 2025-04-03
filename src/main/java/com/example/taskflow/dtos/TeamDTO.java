package com.example.taskflow.dtos;

import com.example.taskflow.entities.Team;

import java.time.LocalDateTime;

public class TeamDTO {
    private Long id;

    private String name;

    private String description;

    private LocalDateTime createdAt;

    public TeamDTO(Team team){
        id = team.getId();
        name = team.getName();
        description = team.getDescription();
        createdAt = team.getCreatedAt();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
