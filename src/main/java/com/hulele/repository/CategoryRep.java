package com.hulele.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hulele.model.Category;

public interface CategoryRep extends JpaRepository<Category, Integer>{

}
