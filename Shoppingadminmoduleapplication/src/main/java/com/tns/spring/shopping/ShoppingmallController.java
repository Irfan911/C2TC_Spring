package com.tns.spring.shopping;


import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ShoppingmallController {
	
	@Autowired
	private ShoppingmallService service;
	
	
	@GetMapping("/shoppingmalls")
	public List<ShoppingMall> list(){
		return service.listAll();
	}
	
	@GetMapping("/shoppingmalls/{id}")  
	public ResponseEntity<ShoppingMall> get(@PathVariable Integer id){
	
	try {
		ShoppingMall shopping=service.get(id);
		return new ResponseEntity<ShoppingMall>(shopping,HttpStatus.OK);
	} 
	catch (NoSuchElementException e) {
		return new ResponseEntity<ShoppingMall>(HttpStatus.NOT_FOUND);
		
	}
	
}
	// RESTful API method for Create operation
	@PostMapping("/shoppingmalls")
	 public void add(@RequestBody ShoppingMall shopping) 
	 {
	 service.save(shopping);
	 }
	
	
	// RESTful API method for Update operation
	 @PutMapping("/shoppingmalls/{id}")
	public ResponseEntity<?> update(@RequestBody ShoppingMall shopping, @PathVariable Integer id) 
	 {
	 try
	 {
	 ShoppingMall existshopping = service.get(id);
	 service.save(shopping);
	 return new ResponseEntity<>(shopping, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 }
}
	
	// RESTful API method for Delete operation
	 @DeleteMapping("/shoppingmalls/{id}")
	 public void delete(@PathVariable Integer id) 
	 {
	 service.delete(id);
	 }
	 
	 	
}


