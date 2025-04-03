package com.example.taskflow.controllers;

import com.example.taskflow.dtos.TeamDTO;
import com.example.taskflow.entities.Team;
import com.example.taskflow.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/team")
public class TeamController {
    @Autowired
    private TeamService teamService;
    @GetMapping
    public List<TeamDTO> findAll() {
        List<TeamDTO> result = teamService.findAll();
        return result;

    }
}
