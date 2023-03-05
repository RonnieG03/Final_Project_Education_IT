package com.project.shoppincart.service;

import com.project.shoppincart.model.Order;

import java.util.List;

public interface OrderService {
    Order save(Order order);

    List<Order> findAll();
}
