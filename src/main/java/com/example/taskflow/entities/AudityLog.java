package com.example.taskflow.entities;

import com.example.taskflow.enums.Action;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="tb_auditylog")
public class AudityLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String details;
    private Action action;
    private LocalDateTime timestamp;
    private String ipAddress;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "performed_by_user_id", nullable = false)
    private User performedBy;

    public AudityLog() {}
    public AudityLog(Long id, String details, Action action, LocalDateTime timestamp, String ipAddress, User performedBy) {
        this.id = id;
        this.details = details;
        this.action = action;
        this.timestamp = timestamp;
        this.ipAddress = ipAddress;
        this.performedBy = performedBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public User getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(User performedBy) {
        this.performedBy = performedBy;
    }
}
