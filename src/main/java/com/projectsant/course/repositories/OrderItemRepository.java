package com.projectsant.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectsant.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
}
