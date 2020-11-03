package com.zensar.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zensar.mvc.model.Product;
import com.zensar.mvc.repository.ProductRepository;

@Service
public class ProductServiceImpl1 implements ProductService {

	@Autowired
	@Qualifier("productRepositoryImpl2")
	private ProductRepository repository;
	
	public int acceptProduct(Product product) {
		return repository.insertProduct(product);
	}

}
