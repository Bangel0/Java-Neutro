package com.app.workinghours.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "workinghours")
@Data
public class workinghours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workinghoursId")
    private Long workinghoursId;

    @Column(name = "ClientId", nullable = false)
    private Long clientId;

    @Column(name = "BarberId", nullable = false)
    private Long barberId;

    @Column(name = "LocationId", nullable = false)
    private Long locationId;

    @Column(name = "ServiceId", nullable = false)
    private Long serviceId;

    @Column(name = "workinghoursDate", nullable = false)
    private LocalDate workinghoursDate;

    @Column(name = "StartTime", nullable = false)
    private LocalTime startTime;

    @Column(name = "EndTime", nullable = false)
    private LocalTime endTime;

    @Column(name = "Price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "Status", nullable = false)
    private String status = "Scheduled";

    @Column(name = "Notes")
    private String notes;

    @Column(name = "CreatedDate", nullable = false)
    private LocalDateTime createdDate = LocalDateTime.now();

    @Column(name = "ModifiedDate", nullable = false)
    private LocalDateTime modifiedDate = LocalDateTime.now();

    // Empty constructor (required for JPA)
    public workinghours() {}

    // Constructor with parameters
    public workinghours(Long id, String patientName, String doctorName, LocalDateTime workinghoursDateTime, String status, String notes) {
        this.workinghoursId = id;
        this.clientId = Long.parseLong(patientName);
        this.barberId = Long.parseLong(doctorName);
        this.workinghoursDate = workinghoursDateTime.toLocalDate();
        this.startTime = workinghoursDateTime.toLocalTime();
        this.endTime = workinghoursDateTime.plusHours(1).toLocalTime();
        this.status = status;
        this.notes = notes;
    }

    // Getters and Setters
    public Long getworkinghoursId() {
        return workinghoursId;
    }

    public void setworkinghoursId(Long workinghoursId) {
        this.workinghoursId = workinghoursId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getBarberId() {
        return barberId;
    }

    public void setBarberId(Long barberId) {
        this.barberId = barberId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public LocalDate getworkinghoursDate() {
        return workinghoursDate;
    }

    public void setworkinghoursDate(LocalDate workinghoursDate) {
        this.workinghoursDate = workinghoursDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
} 