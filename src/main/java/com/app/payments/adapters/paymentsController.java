package com.app.payments.adapters;

import java.util.List;

import com.app.payments.domain.IpaymentsService;
import com.app.payments.domain.payments;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paymentss")
public class paymentsController {
    private final IpaymentsService paymentsService;

    public paymentsController(IpaymentsService paymentsService) {
        this.paymentsService = paymentsService;
    }

    @GetMapping
    public ResponseEntity<List<payments>> getAllpaymentss() {
        List<payments> paymentss = paymentsService.findAll();
        return ResponseEntity.ok(paymentss);
    }

    @GetMapping("/{id}")
    public ResponseEntity<payments> getpaymentsById(@PathVariable Long id) {
        payments payments = paymentsService.findById(id);
        return ResponseEntity.ok(payments);
    }

    @PostMapping
    public ResponseEntity<payments> createpayments(@RequestBody payments payments) {
        payments newpayments = paymentsService.save(payments);
        return ResponseEntity.ok(newpayments);
    }

    @PutMapping("/{id}")
    public ResponseEntity<payments> updatepayments(@PathVariable Long id, @RequestBody payments payments) {
        payments updatedpayments = paymentsService.update(payments, id);
        return ResponseEntity.ok(updatedpayments);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletepayments(@PathVariable Long id) {
        paymentsService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
} 