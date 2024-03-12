package com.example.Cart.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Cart.dtos.FakeStoreProductDto;

@Service
public class cartService {
    
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com/";

    public FakeStoreProductDto[] getAll() {
        FakeStoreProductDto response[] = restTemplate.getForObject(url + "carts", FakeStoreProductDto[].class);
        return response;
    }

    public FakeStoreProductDto getById(int id) {
        FakeStoreProductDto response = restTemplate.getForObject(url + "carts/" + id, FakeStoreProductDto.class);
        return response;
    }
    
    public FakeStoreProductDto[] getByDateRange(String from, String to) {
        FakeStoreProductDto response[] = restTemplate.getForObject(url + "carts?startdate=" + from + "&enddate=" + to, FakeStoreProductDto[].class);
        return response;
    }

    public FakeStoreProductDto[] getByUserId(int id) {
        FakeStoreProductDto response[] = restTemplate.getForObject(url + "carts/user/" + id, FakeStoreProductDto[].class);
        return response;
    }
}
