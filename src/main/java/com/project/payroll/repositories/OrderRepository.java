package com.project.payroll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.payroll.entities.Order;

// This is where the orders are stored.
public interface OrderRepository extends JpaRepository<Order, Long> {}
