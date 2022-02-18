package com.hulele.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hulele.model.Category;

@Repository
public interface CategoryRep extends JpaRepository<Category, Integer>{

}
