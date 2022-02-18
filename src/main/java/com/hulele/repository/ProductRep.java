package com.hulele.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hulele.model.Product;

@Repository
public interface ProductRep extends JpaRepository<Product, Integer>{
	
}
