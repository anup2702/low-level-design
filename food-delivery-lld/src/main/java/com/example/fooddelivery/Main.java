package com.example.fooddelivery;

import com.example.fooddelivery.enums.*;
import com.example.fooddelivery.models.*;
import com.example.fooddelivery.payments.*;
import com.example.fooddelivery.users.*;

public class Main {

    public static void main(String[] args) {

        // Create a restaurant
        Restaurant rest = new Restaurant("R1", "Pizza Palace", 4.5);
        rest.showMenu();

        // Create a customer
        Customer customer = new Customer("C1", "Anup", "9999999999", "Kolkata", "anup@example.com");

        // Create a delivery partner
        DeliveryPartner partner = new DeliveryPartner("D1", "Rahul", "8888888888", "Bike");

        // Create an order (initial status + payment mode)
        Order order = new Order(
                "O1",
                customer.getName(),  
                rest.getRestaurantId(),
                partner.getName(),          
                450.0,
                OrderStatus.PLACED,
                PaymentMode.UPI
        );

        System.out.println(order.placeOrder());

        // Assign delivery partner
        System.out.println(order.assignDeliveryPartner("D1"));

        // Process payment using interface (runtime polymorphism)
        Payable payment = new PaymentByCard("1234-5678-9012-3456", "Anup", "12/25", "123");
        payment.processPayment(order.getTotalAmount());

        // Update statuses step-by-step
        System.out.println(order.updateStatus(OrderStatus.PREPARING));
        System.out.println(order.updateStatus(OrderStatus.DISPATCHED));
        System.out.println(order.completeOrder());

        // Display user info (polymorphism)
        customer.displayInfo();
        partner.displayInfo();

        // TODO: Try adding:
        // - another order
        // - PaymentByCard instead
        // - cancellation flow
        // - delivery partner earnings
    }
}
