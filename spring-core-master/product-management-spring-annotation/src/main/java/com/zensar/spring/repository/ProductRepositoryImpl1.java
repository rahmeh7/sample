package com.zensar.spring.repository;

import org.springframework.stereotype.Repository;

import com.zensar.spring.beans.Product;

@Repository
public class ProductRepositoryImpl1 implements ProductRepository {
	
	Product products[]=new Product[10];
	
	int index=0,count=0,productId=100;
	
	public ProductRepositoryImpl1() {
		System.out.println("Inside ProductRepositoryImpl1 impl");
	}

	public int insertProduct(Product product) {
		product.setProductId(productId++);
		products[index]=product;
		return product.getProductId();
	}

}
