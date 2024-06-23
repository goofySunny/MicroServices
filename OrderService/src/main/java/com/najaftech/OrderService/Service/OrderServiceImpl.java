package com.najaftech.OrderService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.najaftech.OrderService.Entity.Order;
import com.najaftech.OrderService.Model.OrderRequest;
import com.najaftech.OrderService.Repository.OrderRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Long placeOrder(OrderRequest orderRequest) {
        log.info("Creating order based on {}", orderRequest);
 
        return (long) 0;
    }
}
