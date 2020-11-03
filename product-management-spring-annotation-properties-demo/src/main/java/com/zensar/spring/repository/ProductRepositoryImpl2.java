package com.zensar.spring.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zensar.spring.beans.Product;
@Repository
public class ProductRepositoryImpl2 implements ProductRepository {

	public int insertProduct(Product product) {
		return 0;
	}

	public List<Product> getAllProducts() {
		return null;
	}

}
