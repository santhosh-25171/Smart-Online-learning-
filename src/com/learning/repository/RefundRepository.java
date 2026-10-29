package com.learning.repository;

import com.learning.model.Refund;
import java.util.ArrayList;
import java.util.List;

public class RefundRepository {
    private final List<Refund> refunds = new ArrayList<>();

    public void addRefund(Refund refund) {
        refunds.add(refund);
    }

    public Refund findById(String id) {
        for (Refund refund : refunds) {
            if (refund.getRefundId().equals(id)) {
                return refund;
            }
        }
        return null;
    }

    public List<Refund> findAll() {
        return refunds;
    }

    public boolean deleteById(String id) {
        return refunds.removeIf(refund -> refund.getRefundId().equals(id));
    }
}
