package com.example.fooddelivery.payments;

public class PaymentByCard implements Payable{
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    public PaymentByCard(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;  // never store CVV due to security and PCI compliance.
    }

    @Override
    public double processPayment(double amount) {
        System.out.println("Processing card payment of amount: " + amount);
        return amount;
    }
}