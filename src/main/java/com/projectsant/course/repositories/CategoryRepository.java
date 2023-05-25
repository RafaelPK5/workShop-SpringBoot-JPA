package com.projectsant.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectsant.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
