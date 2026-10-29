package com.learning.service;

import com.learning.model.Refund;
import com.learning.repository.RefundRepository;
import java.util.List;

public class RefundService {
    private final RefundRepository refundRepository;

    public RefundService(RefundRepository refundRepository) {
        this.refundRepository = refundRepository;
    }

    public void requestRefund(Refund refund) {
        if (refund == null || refund.getStudentId() == null || refund.getStudentId().isEmpty()) {
            throw new IllegalArgumentException("Student ID is required");
        }
        refundRepository.addRefund(refund);
    }

    public Refund getRefundById(String id) {
        return refundRepository.findById(id);
    }

    public List<Refund> getAllRefunds() {
        return refundRepository.findAll();
    }
}
