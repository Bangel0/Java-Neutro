package com.app.services.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "services")
@Data
public class services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servicesId")
    private Long servicesId;

    @Column(name = "ClientId", nullable = false)
    private Long clientId;

    @Column(name = "BarberId", nullable = false)
    private Long barberId;

    @Column(name = "LocationId", nullable = false)
    private Long locationId;

    @Column(name = "ServiceId", nullable = false)
    private Long serviceId;

    @Column(name = "servicesDate", nullable = false)
    private LocalDate servicesDate;

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
    public services() {}

    // Constructor with parameters
    public services(Long id, String patientName, String doctorName, LocalDateTime servicesDateTime, String status, String notes) {
        this.servicesId = id;
        this.clientId = Long.parseLong(patientName);
        this.barberId = Long.parseLong(doctorName);
        this.servicesDate = servicesDateTime.toLocalDate();
        this.startTime = servicesDateTime.toLocalTime();
        this.endTime = servicesDateTime.plusHours(1).toLocalTime();
        this.status = status;
        this.notes = notes;
    }

    // Getters and Setters
    public Long getservicesId() {
        return servicesId;
    }

    public void setservicesId(Long servicesId) {
        this.servicesId = servicesId;
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

    public LocalDate getservicesDate() {
        return servicesDate;
    }

    public void setservicesDate(LocalDate servicesDate) {
        this.servicesDate = servicesDate;
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