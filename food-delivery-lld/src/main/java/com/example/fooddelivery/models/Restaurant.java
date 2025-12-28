package com.example.fooddelivery.models;

public class Restaurant{
    private String restaurantId;
    private String name;
    private double rating;

    public Restaurant(String restaurantId, String name, double rating) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.rating = rating;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void showMenu(){
        System.out.println("Displaying menu for restaurant: " + name);
        System.out.println("1. Pizza - $10");
        System.out.println("2. Burger - $8");
        System.out.println("3. Pasta - $12");
        System.out.println("4. Salad - $7");
        System.out.println("5. Brownie - $5");
        System.out.println("6. Soda - $3");
        System.out.println("7. Coffee - $4");
        System.out.println("8. French Fries - $6");
        System.out.println("9. Ice Cream - $4");
        System.out.println("10. Donut - $3");
    }
}