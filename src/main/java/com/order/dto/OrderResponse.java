package com.order.dto;

import java.util.List;
import java.util.Objects;

import com.order.model.Order;
import com.order.model.Product;

public class OrderResponse {

    private Long id;
    private List<Product> products;
    private double priceTotal;
    private Integer status;


    public OrderResponse(Order order) {
        this.id = order.getId();
        this.status = order.getStatus();
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

	public Integer getStatus() {
		return status;
	}
    
}
