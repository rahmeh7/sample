package com.zensar.mvc.repository;

import org.springframework.stereotype.Repository;

import com.zensar.mvc.model.Product;

@Repository
public class ProductRepositoryImpl1 implements ProductRepository {

	Product[] products=new Product[10];
	
	private static int index=0,productId=100;
	
	public int insertProduct(Product product) {
		
		product.setProductId(productId++);
		
		products[index++]=product;
		
		return product.getProductId();
	}

}
