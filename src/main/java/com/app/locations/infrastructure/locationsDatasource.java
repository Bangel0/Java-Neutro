package com.app.locations.infrastructure;

import java.util.List;
import java.util.Optional;

import com.app.locations.domain.locations;
import com.app.locations.domain.IlocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class locationsDatasource {
    
    @Autowired
    private IlocationsRepository locationsRepository;

    public List<locations> findAll() {
        return locationsRepository.findAll();
    }

    public Optional<locations> findById(Long locationsId) {
        return locationsRepository.findById(locationsId);
    }

    public locations save(locations locations) {
        return locationsRepository.save(locations);
    }

    public locations update(locations locations, Long locationsId) {
        return locationsRepository.save(locations);
    }

    public void deleteById(Long locationsId) {
        locationsRepository.deleteById(locationsId);
    }
} 