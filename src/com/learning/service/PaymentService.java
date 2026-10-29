package com.learning.service;

import com.learning.model.Payment;
import com.learning.repository.PaymentRepository;
import java.util.List;

public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public void recordPayment(Payment payment) {
        if (payment == null || payment.getStudentId() == null || payment.getStudentId().isEmpty()) {
            throw new IllegalArgumentException("Student ID is required");
        }
        paymentRepository.addPayment(payment);
    }

    public Payment getPaymentById(String id) {
        return paymentRepository.findById(id);
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
}
