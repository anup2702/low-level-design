package com.example.fooddelivery.users;

public class Customer extends User{
    private String address;
    private String email;

    public Customer(String id, String name, String phone, String address, String email){
        super(id, name, phone);
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return super.getName();
    }

    @Override
    public void displayInfo(){
        System.out.println("Customer Details:");
        System.out.println("Name: " + super.getName());
        System.out.println("Phone: " + super.getPhone());
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
    }
}