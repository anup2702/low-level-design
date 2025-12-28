package com.example.fooddelivery.users;

public abstract class User{
    private String id;
    private String name;
    private String phone;

    public User(String id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public abstract void displayInfo();
}