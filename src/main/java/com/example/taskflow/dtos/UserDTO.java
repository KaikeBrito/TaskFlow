package com.example.taskflow.dtos;

import com.example.taskflow.entities.User;
import com.example.taskflow.enums.Role;

import java.time.LocalDateTime;

public class UserDTO {

    private Long id;

    private String name;

    private String email;

    private Integer age;

    private String username;

    private String password;

    private Role role;

    private LocalDateTime createdAt = LocalDateTime.now();

    private Boolean isActive;

    public UserDTO(User user) {
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
        age = user.getAge();
        username = user.getUsername();
        password = user.getPassword();
        role = user.getRole();
        createdAt = user.getCreatedAt();
        isActive = user.getActive();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
