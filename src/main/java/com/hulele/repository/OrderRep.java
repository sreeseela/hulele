package com.hulele.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hulele.model.Order;

public interface OrderRep extends JpaRepository<Order, Integer>{

}
