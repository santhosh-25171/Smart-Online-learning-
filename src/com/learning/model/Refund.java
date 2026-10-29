package com.learning.model;

import java.time.LocalDateTime;

public class Refund {
    private String refundId;
    private String paymentId;
    private String studentId;
    private double amount;
    private String reason;
    private String status;
    private LocalDateTime requestedAt;

    public Refund() {
    }

    public Refund(String refundId, String paymentId, String studentId, double amount, String reason, String status, LocalDateTime requestedAt) {
        this.refundId = refundId;
        this.paymentId = paymentId;
        this.studentId = studentId;
        this.amount = amount;
        this.reason = reason;
        this.status = status;
        this.requestedAt = requestedAt;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getRequestedAt() {
        return requestedAt;
    }

    public void setRequestedAt(LocalDateTime requestedAt) {
        this.requestedAt = requestedAt;
    }
}
