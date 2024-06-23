package com.najaftech.OrderService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.najaftech.OrderService.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
