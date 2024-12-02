package com.order.dto;

import java.util.List;

import com.order.model.Product;

public class OrderRequest {

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
