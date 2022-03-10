package com.tns.spring.shopping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class ShoppingmallService {
     
	@Autowired
	private ShoppingmallRepository repository;
	public List<ShoppingMall> listAll() {
		
		return repository.findAll();
	}
	public ShoppingMall get(Integer id) {
		return repository.findById(id).get();
	}
	public void save(ShoppingMall shopping) {
		repository.save(shopping);
	}
	public void delete(Integer id) {
		repository.deleteById(id);
	}	
	

}
