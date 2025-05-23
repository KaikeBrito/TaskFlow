package com.example.taskflow.repositories;

import com.example.taskflow.dtos.UserDTO;
import com.example.taskflow.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
