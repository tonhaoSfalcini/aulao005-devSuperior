package com.dev.myfirstproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.myfirstproject.entities.Product;
import com.dev.myfirstproject.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	ProductRepository rep;

	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		return ResponseEntity.ok().body(rep.findAll());
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		return ResponseEntity.ok().body(rep.findById(id));
	}
	

}
