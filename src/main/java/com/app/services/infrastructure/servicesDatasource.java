package com.app.services.infrastructure;

import java.util.List;
import java.util.Optional;

import com.app.services.domain.services;
import com.app.services.domain.IservicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class servicesDatasource {
    
    @Autowired
    private IservicesRepository servicesRepository;

    public List<services> findAll() {
        return servicesRepository.findAll();
    }

    public Optional<services> findById(Long servicesId) {
        return servicesRepository.findById(servicesId);
    }

    public services save(services services) {
        return servicesRepository.save(services);
    }

    public services update(services services, Long servicesId) {
        return servicesRepository.save(services);
    }

    public void deleteById(Long servicesId) {
        servicesRepository.deleteById(servicesId);
    }
} 