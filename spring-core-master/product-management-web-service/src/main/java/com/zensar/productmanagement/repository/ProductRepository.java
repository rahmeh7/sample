package com.zensar.productmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.productmanagement.beans.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	// List<Product> getByProductName(String productName);
	
	
	//List<Product> giveMeProduct(String name);
	
	@Query("from Product p where p.productName = :name")
	List<Product> giveMeProduct(@Param("name")String name);
}
