package com.app.payments.application;

import java.util.List;

import com.app.payments.domain.payments;
import com.app.payments.domain.IpaymentsRepository;
import com.app.payments.domain.IpaymentsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class paymentsService implements IpaymentsService {
    private final IpaymentsRepository paymentsRepository;

    public paymentsService(IpaymentsRepository paymentsRepository) {
        this.paymentsRepository = paymentsRepository;
    }

    @Override
    public List<payments> findAll() {
        return paymentsRepository.findAll();
    }

    @Override
    public payments findById(Long id) {
        return paymentsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("payments not found with ID: " + id));
    }

    @Override
    @Transactional
    public payments save(payments payments) {
        return paymentsRepository.save(payments);
    }

    @Override
    @Transactional
    public payments update(payments payments, Long id) {
        payments existing = findById(id);
        // Aquí puedes actualizar solo los campos necesarios
        payments.setpaymentsId(existing.getpaymentsId());
        return paymentsRepository.save(payments);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        payments payments = findById(id);
        paymentsRepository.delete(payments);
    }
} 