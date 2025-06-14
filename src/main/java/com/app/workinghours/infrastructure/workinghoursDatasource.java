package com.app.workinghours.infrastructure;

import java.util.List;
import java.util.Optional;

import com.app.workinghours.domain.workinghours;
import com.app.workinghours.domain.IworkinghoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class workinghoursDatasource {
    
    @Autowired
    private IworkinghoursRepository workinghoursRepository;

    public List<workinghours> findAll() {
        return workinghoursRepository.findAll();
    }

    public Optional<workinghours> findById(Long workinghoursId) {
        return workinghoursRepository.findById(workinghoursId);
    }

    public workinghours save(workinghours workinghours) {
        return workinghoursRepository.save(workinghours);
    }

    public workinghours update(workinghours workinghours, Long workinghoursId) {
        return workinghoursRepository.save(workinghours);
    }

    public void deleteById(Long workinghoursId) {
        workinghoursRepository.deleteById(workinghoursId);
    }
} 