package com.najaftech.OrderService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.najaftech.OrderService.Entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
