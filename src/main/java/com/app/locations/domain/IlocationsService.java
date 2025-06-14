package com.app.locations.domain;

import java.util.List;

public interface IlocationsService {
    List<locations> findAll();
    locations findById(Long id);
    locations save(locations appointment);
    locations update(locations appointment, Long id);
    void deleteById(Long id);
} 