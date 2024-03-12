package com.example.Cart.models;

import lombok.Getter;
import lombok.Setter;

// Develop a Spring Boot application that functions as a Cart Service, which internally makes API calls to the Fake Store API. The application should be able to perform the following operations:
// Get all
// Get a single
// Get in data range
// Get user cart
// Add new cart
// Update a cart
// Delete a cart
// write clean, efficient, and scalable code adhering to the MVC pattern
@Getter
@Setter
public class cart {
    private int id;
    private int userId;
    private String date;
    private product[] products;

    public cart(int id, int userId, String date, product[] products) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.products = products;
    }

    public cart() {
    }

}
