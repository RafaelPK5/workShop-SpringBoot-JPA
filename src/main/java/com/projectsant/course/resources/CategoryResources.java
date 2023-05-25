package com.projectsant.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectsant.course.entities.Category;
import com.projectsant.course.services.CategoryService;

@RestController
@RequestMapping(value = "/Categories")
public class CategoryResources {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> findByID(@PathVariable Long id){
		Category obj = service.findByID(id);
		return ResponseEntity.ok().body(obj);
	}
}
