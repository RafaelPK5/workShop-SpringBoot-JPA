package com.projectsant.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectsant.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
