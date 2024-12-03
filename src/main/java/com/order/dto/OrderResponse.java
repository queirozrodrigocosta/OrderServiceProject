package com.order.dto;

import java.util.List;
import java.util.Objects;

import com.order.model.Order;
import com.order.model.Product;

public class OrderResponse {

    private Long id;
    private List<Product> products;
    private double priceTotal;


    public OrderResponse(Order order) {
        this.id = order.getId();
        this.products = order.getProducts();
    }

    public Long getId() {
        return id;
    }

    public List<Product> getProducts() {
    	priceTotal = products.stream().filter(Objects::nonNull).mapToDouble(Product::getPrice).sum();
        return products;
    }

	public double getPriceTotal() {
		return priceTotal;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
    
    
}
