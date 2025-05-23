package com.example.taskflow.repositories;
import com.example.taskflow.dtos.TaskDTO;
import com.example.taskflow.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}