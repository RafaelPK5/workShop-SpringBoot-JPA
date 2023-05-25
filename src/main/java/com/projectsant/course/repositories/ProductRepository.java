package com.projectsant.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectsant.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
