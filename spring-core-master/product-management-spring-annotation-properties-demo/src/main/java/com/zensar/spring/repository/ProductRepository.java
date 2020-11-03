package com.zensar.spring.repository;

import java.util.List;

import com.zensar.spring.beans.Product;

public interface ProductRepository {

	public int insertProduct(Product product);
	
	public List<Product> getAllProducts();
}
