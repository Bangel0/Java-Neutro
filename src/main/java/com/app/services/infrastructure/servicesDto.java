package com.app.services.infrastructure;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class servicesDto {
    private Long servicesId;
    private Long clientId;
    private Long barberId;
    private Long locationId;
    private Long serviceId;
    private LocalDate servicesDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private BigDecimal price;
    private String status;
    private String notes;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public servicesDto() {}

    public servicesDto(Long servicesId, Long clientId, Long barberId, Long locationId, 
                         Long serviceId, LocalDate servicesDate, LocalTime startTime, 
                         LocalTime endTime, BigDecimal price, String status, String notes) {
        this.servicesId = servicesId;
        this.clientId = clientId;
        this.barberId = barberId;
        this.locationId = locationId;
        this.serviceId = serviceId;
        this.servicesDate = servicesDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
        this.status = status;
        this.notes = notes;
        this.createdDate = LocalDateTime.now();
        this.modifiedDate = LocalDateTime.now();
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