package com.example.Cart.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class product {
    private int productId;
    private int quantity;

    public product( int id, int quantity) {
        this.productId = id;
        this.quantity = quantity;
    }

    public product() {
    }
}
