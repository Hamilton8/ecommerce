package com.guirrugo.ecommerce.entities;

import com.guirrugo.ecommerce.enums.PaymentStatus;

import java.time.LocalDateTime;


public class Payment {

    private Long id;
    private Order order;
    private double amount;
    private LocalDateTime paymentDate;
    private PaymentStatus status;

    public Payment(Order order, double amount, LocalDateTime paymentDate, PaymentStatus status) {
        this.order = order;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
