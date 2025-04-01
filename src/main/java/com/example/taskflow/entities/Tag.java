package com.example.taskflow.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String color;
    @ManyToMany(mappedBy = "tags")
    private List<Task> tasks;

    public Tag(){}


    public Tag(Long id, String name, String color, List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.tasks = tasks;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
