package com.example.fooddelivery.users;

public class DeliveryPartner extends User {
    private String vehicleType;

    public DeliveryPartner(String id, String name, String phone, String vehicleType) {
        super(id, name, phone);
        this.vehicleType = vehicleType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Delivery Partner Details:");
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
        System.out.println("Vehicle Type: " + vehicleType);
    }
}