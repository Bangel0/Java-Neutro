package com.app.payments.infrastructure;

import java.util.List;
import java.util.Optional;

import com.app.payments.domain.payments;
import com.app.payments.domain.IpaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class paymentsDatasource {
    
    @Autowired
    private IpaymentsRepository paymentsRepository;

    public List<payments> findAll() {
        return paymentsRepository.findAll();
    }

    public Optional<payments> findById(Long paymentsId) {
        return paymentsRepository.findById(paymentsId);
    }

    public payments save(payments payments) {
        return paymentsRepository.save(payments);
    }

    public payments update(payments payments, Long paymentsId) {
        return paymentsRepository.save(payments);
    }

    public void deleteById(Long paymentsId) {
        paymentsRepository.deleteById(paymentsId);
    }
} 