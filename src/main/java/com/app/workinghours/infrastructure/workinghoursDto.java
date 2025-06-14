package com.app.workinghours.infrastructure;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class workinghoursDto {
    private Long workinghoursId;
    private Long clientId;
    private Long barberId;
    private Long locationId;
    private Long serviceId;
    private LocalDate workinghoursDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private BigDecimal price;
    private String status;
    private String notes;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public workinghoursDto() {}

    public workinghoursDto(Long workinghoursId, Long clientId, Long barberId, Long locationId, 
                         Long serviceId, LocalDate workinghoursDate, LocalTime startTime, 
                         LocalTime endTime, BigDecimal price, String status, String notes) {
        this.workinghoursId = workinghoursId;
        this.clientId = clientId;
        this.barberId = barberId;
        this.locationId = locationId;
        this.serviceId = serviceId;
        this.workinghoursDate = workinghoursDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
        this.status = status;
        this.notes = notes;
        this.createdDate = LocalDateTime.now();
        this.modifiedDate = LocalDateTime.now();
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