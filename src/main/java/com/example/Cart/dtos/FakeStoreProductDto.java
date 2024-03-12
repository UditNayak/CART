package com.example.Cart.dtos;

import com.example.Cart.models.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    public FakeStoreProductDto(FakeStoreProductDto cart) {
        this.id = cart.getId();
        this.userId = cart.getUserId();
        this.date = cart.getDate();
        this.products = cart.getProducts();
    }

    private int id;
    private int userId;
    private String date;
    private product[] products;
}
