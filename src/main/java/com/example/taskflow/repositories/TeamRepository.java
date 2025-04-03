package com.example.taskflow.repositories;
import com.example.taskflow.dtos.TeamDTO;
import com.example.taskflow.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
