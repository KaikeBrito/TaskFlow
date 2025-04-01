package com.example.taskflow.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cor;
    @ManyToMany(
            mappedBy = "tags"
    )
    private List<Task> tasks;

    public Tag(){}


    public Tag(Long id, String nome, String cor, List<Task> tasks) {
        this.id = id;
        this.nome = nome;
        this.cor = cor;
        this.tasks = tasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
