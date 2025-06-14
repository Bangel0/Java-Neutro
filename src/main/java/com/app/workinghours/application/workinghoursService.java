package com.app.workinghours.application;

import java.util.List;

import com.app.workinghours.domain.workinghours;
import com.app.workinghours.domain.IworkinghoursRepository;
import com.app.workinghours.domain.IworkinghoursService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class workinghoursService implements IworkinghoursService {
    private final IworkinghoursRepository workinghoursRepository;

    public workinghoursService(IworkinghoursRepository workinghoursRepository) {
        this.workinghoursRepository = workinghoursRepository;
    }

    @Override
    public List<workinghours> findAll() {
        return workinghoursRepository.findAll();
    }

    @Override
    public workinghours findById(Long id) {
        return workinghoursRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("workinghours not found with ID: " + id));
    }

    @Override
    @Transactional
    public workinghours save(workinghours workinghours) {
        return workinghoursRepository.save(workinghours);
    }

    @Override
    @Transactional
    public workinghours update(workinghours workinghours, Long id) {
        workinghours existing = findById(id);
        // Aquí puedes actualizar solo los campos necesarios
        workinghours.setworkinghoursId(existing.getworkinghoursId());
        return workinghoursRepository.save(workinghours);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        workinghours workinghours = findById(id);
        workinghoursRepository.delete(workinghours);
    }
} 