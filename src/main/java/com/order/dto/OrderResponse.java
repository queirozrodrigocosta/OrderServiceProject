package com.order.dto;

import java.util.List;

import com.order.model.Order;
import com.order.model.Product;

public class OrderResponse {

    private Long id;
    private List<Product> products;

    public OrderResponse(Order order) {
        this.id = order.getId();
        this.products = order.getProducts();
    }

    public Long getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }
}
