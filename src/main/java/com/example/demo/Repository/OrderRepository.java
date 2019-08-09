package com.example.demo.Repository;

import com.example.demo.Domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
