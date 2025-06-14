package com.app.services.application;

import java.util.List;

import com.app.services.domain.services;
import com.app.services.domain.IservicesRepository;
import com.app.services.domain.IservicesService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class servicesService implements IservicesService {
    private final IservicesRepository servicesRepository;

    public servicesService(IservicesRepository servicesRepository) {
        this.servicesRepository = servicesRepository;
    }

    @Override
    public List<services> findAll() {
        return servicesRepository.findAll();
    }

    @Override
    public services findById(Long id) {
        return servicesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("services not found with ID: " + id));
    }

    @Override
    @Transactional
    public services save(services services) {
        return servicesRepository.save(services);
    }

    @Override
    @Transactional
    public services update(services services, Long id) {
        services existing = findById(id);
        // Aquí puedes actualizar solo los campos necesarios
        services.setservicesId(existing.getservicesId());
        return servicesRepository.save(services);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        services services = findById(id);
        servicesRepository.delete(services);
    }
} 