package com.example.fooddelivery.payments;

public class PaymentByUPI implements Payable{
    private String upiId;

    public PaymentByUPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public double processPayment(double amount) {
        System.out.println("Processing upi payment of amount: " + amount);
        return amount;
    }
}