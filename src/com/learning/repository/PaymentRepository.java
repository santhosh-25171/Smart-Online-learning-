package com.learning.repository;

import com.learning.model.Payment;
import java.util.ArrayList;
import java.util.List;

public class PaymentRepository {
    private final List<Payment> payments = new ArrayList<>();

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public Payment findById(String id) {
        for (Payment payment : payments) {
            if (payment.getPaymentId().equals(id)) {
                return payment;
            }
        }
        return null;
    }

    public List<Payment> findAll() {
        return payments;
    }

    public boolean deleteById(String id) {
        return payments.removeIf(payment -> payment.getPaymentId().equals(id));
    }
}
