package com.app.services.domain;

import java.util.List;

public interface IservicesService {
    List<services> findAll();
    services findById(Long id);
    services save(services services);
    services update(services services, Long id);
    void deleteById(Long id);
} 