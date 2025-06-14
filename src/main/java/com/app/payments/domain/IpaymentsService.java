package com.app.payments.domain;

import java.util.List;

public interface IpaymentsService {
    List<payments> findAll();
    payments findById(Long id);
    payments save(payments appointment);
    payments update(payments appointment, Long id);
    void deleteById(Long id);
} 