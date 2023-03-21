package com.project.shoppincart.service.Impl;

import com.project.shoppincart.model.OrderDetail;
import com.project.shoppincart.repository.OrderDetailRepository;
import com.project.shoppincart.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDetail save(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }
}
