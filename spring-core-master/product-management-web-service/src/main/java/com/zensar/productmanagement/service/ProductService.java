package com.zensar.productmanagement.service;

import java.util.List;

import com.zensar.productmanagement.beans.Product;

public interface ProductService {

	
	public Iterable<Product> getAllProducts() ;
	
	public List<Product> getProductByName(String productName) ;

	
	public Product getProduct(int productId);


	public Product insertProduct(Product product) ;
	
	
	public void deleteProduct( int productId);


	public void updateProduct(int productId,  Product updatedProduct);
}