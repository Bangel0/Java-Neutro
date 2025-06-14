package com.app.locations.application;

import java.util.List;

import com.app.locations.domain.locations;
import com.app.locations.domain.IlocationsRepository;
import com.app.locations.domain.IlocationsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class locationsService implements IlocationsService {
    private final IlocationsRepository locationsRepository;

    public locationsService(IlocationsRepository locationsRepository) {
        this.locationsRepository = locationsRepository;
    }

    @Override
    public List<locations> findAll() {
        return locationsRepository.findAll();
    }

    @Override
    public locations findById(Long id) {
        return locationsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("locations not found with ID: " + id));
    }

    @Override
    @Transactional
    public locations save(locations locations) {
        return locationsRepository.save(locations);
    }

    @Override
    @Transactional
    public locations update(locations locations, Long id) {
        locations existing = findById(id);
        // Aquí puedes actualizar solo los campos necesarios
        locations.setlocationsId(existing.getlocationsId());
        return locationsRepository.save(locations);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        locations locations = findById(id);
        locationsRepository.delete(locations);
    }
} 