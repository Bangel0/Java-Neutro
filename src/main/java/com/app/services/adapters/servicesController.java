package com.app.services.adapters;

import java.util.List;

import com.app.services.domain.IservicesService;
import com.app.services.domain.services;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/services")
public class servicesController {
    private final IservicesService serviceservice;

    public servicesController(IservicesService serviceservice) {
        this.serviceservice = serviceservice;
    }

    @GetMapping
    public ResponseEntity<List<services>> getAllservices() {
        List<services> services = serviceservice.findAll();
        return ResponseEntity.ok(services);
    }

    @GetMapping("/{id}")
    public ResponseEntity<services> getservicesById(@PathVariable Long id) {
        services services = serviceservice.findById(id);
        return ResponseEntity.ok(services);
    }

    @PostMapping
    public ResponseEntity<services> createservices(@RequestBody services services) {
        services newservices = serviceservice.save(services);
        return ResponseEntity.ok(newservices);
    }

    @PutMapping("/{id}")
    public ResponseEntity<services> updateservices(@PathVariable Long id, @RequestBody services services) {
        services updatedservices = serviceservice.update(services, id);
        return ResponseEntity.ok(updatedservices);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteservices(@PathVariable Long id) {
        serviceservice.deleteById(id);
        return ResponseEntity.noContent().build();
    }
} 