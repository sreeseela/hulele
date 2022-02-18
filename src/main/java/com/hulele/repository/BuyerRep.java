package com.hulele.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hulele.model.Buyer;

@Repository
public interface BuyerRep extends JpaRepository<Buyer, Integer>{
	
}
