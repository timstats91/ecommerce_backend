package com.springbootvue.ecommerce.repository;

import org.springframework.stereotype.Repository;

import com.springbootvue.ecommerce.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{
	
}
