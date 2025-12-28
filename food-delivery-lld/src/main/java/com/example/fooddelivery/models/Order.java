package com.example.fooddelivery.models;

import com.example.fooddelivery.enums.OrderStatus;
import com.example.fooddelivery.enums.PaymentMode;

public class Order{
    private String orderId;
    private String customerId;
    private String restaurantId;
    private String deliveryPartner;
    private double totalAmount;
    private OrderStatus status;
    private PaymentMode paymentMode;

    public Order(String orderId, String customerId, String restaurantId, String deliveryPartner, double totalPrice, OrderStatus status, PaymentMode paymentMode) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.deliveryPartner = deliveryPartner;
        this.totalAmount = totalPrice;
        this.status = status;
        this.paymentMode = paymentMode;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String placeOrder() {
        this.status = OrderStatus.PLACED;
        return "Order placed with ID: " + this.orderId;
    }

    public String assignDeliveryPartner(String deliveryPartnerId) {
        this.deliveryPartner = deliveryPartnerId;
        return "Delivery partner " + deliveryPartnerId + " assigned to order " + this.orderId;
    }

    public String updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
        return "Order " + this.orderId + " status updated to " + newStatus;
    }

    public String completeOrder() {
        this.status = OrderStatus.DELIVERED;
        return "Order " + this.orderId + " completed.";
    }

}