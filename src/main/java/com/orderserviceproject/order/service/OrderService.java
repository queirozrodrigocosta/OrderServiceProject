package com.orderserviceproject.order.service;

import com.orderserviceproject.order.dto.OrderRequest;
import com.orderserviceproject.order.dto.OrderResponse;
import com.orderserviceproject.order.model.Order;
import com.orderserviceproject.order.model.Product;
import com.orderserviceproject.order.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderResponse createOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setProducts(orderRequest.getProducts());
        order.setStatus(1);
        order = orderRepository.save(order);
        return new OrderResponse(order);
    }

    public List<OrderResponse> getAllOrders() {
        return orderRepository.findAll().stream()
                .map(OrderResponse::new)
                .collect(Collectors.toList());
    }
}
