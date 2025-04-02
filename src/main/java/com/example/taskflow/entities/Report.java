package com.example.taskflow.entities;
import com.example.taskflow.enums.Status;
import com.example.taskflow.enums.Type;
import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "tb_reports")

public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Type type;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;

    @Column(name = "generated_at")
    private LocalDateTime generatedAt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status = Status.IN_PROGRESS; // Valor padrão

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "generated_by_user_id", nullable = false)
    private User generatedBy;

    @Column(name = "file_path")
    private String filePath; // Caminho do arquivo PDF ou URL


    @PreUpdate
    public void onUpdate() {
        if (this.status == Status.DONE && this.generatedAt == null) {
            this.generatedAt = LocalDateTime.now();
        }
    }

    // Construtor para criação de relatórios
    public  Report() {}
    public Report(Type type, LocalDateTime startDate, LocalDateTime endDate, User generatedBy) {
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.generatedBy = generatedBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(LocalDateTime generatedAt) {
        this.generatedAt = generatedAt;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(User generatedBy) {
        this.generatedBy = generatedBy;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}