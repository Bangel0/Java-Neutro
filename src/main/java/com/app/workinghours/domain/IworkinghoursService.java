package com.app.workinghours.domain;

import java.util.List;

public interface IworkinghoursService {
    List<workinghours> findAll();
    workinghours findById(Long id);
    workinghours save(workinghours appointment);
    workinghours update(workinghours appointment, Long id);
    void deleteById(Long id);
} 