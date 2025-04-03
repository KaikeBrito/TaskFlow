package com.example.taskflow.services;

import com.example.taskflow.dtos.TeamDTO;
import com.example.taskflow.entities.Team;
import com.example.taskflow.repositories.TeamRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    @Transactional
    public List<TeamDTO> findAll() {
        List<Team> result = teamRepository.findAll();
        return result.stream().map(TeamDTO::new).toList();

    }

}
