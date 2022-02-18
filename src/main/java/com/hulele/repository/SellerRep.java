package com.hulele.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hulele.model.Seller;

@Repository
public interface SellerRep extends JpaRepository<Seller, Integer>{
	
}
