package com.example.Cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cart.dtos.FakeStoreProductDto;
import com.example.Cart.service.cartService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CartController {
    @Autowired
    cartService cs;

    @GetMapping("/carts")
    public FakeStoreProductDto[] getAll() {
        return cs.getAll();
    }

    @GetMapping("/carts/{id}")
    public FakeStoreProductDto getById(@PathVariable int id) {
        return cs.getById(id);
    }

    @GetMapping("/carts/{from}/{to}")
    public FakeStoreProductDto[] getByDateRange(@PathVariable String from, @PathVariable String to) {
        return cs.getByDateRange(from, to);
    }

    @GetMapping("/carts/user/{id}")
    public FakeStoreProductDto[] getByUserId(@PathVariable int id) {
        return cs.getByUserId(id);
    }

    // @PostMapping("/carts")
    // public void addCart(@RequestBody FakeStoreProductDto cart) {
    //     cs.addCart(cart);
    // }

}