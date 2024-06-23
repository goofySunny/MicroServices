package com.najaftech.OrderService.Service;

import com.najaftech.OrderService.Model.OrderRequest;

public interface OrderService {

    public Long placeOrder(OrderRequest orderRequest);

}
