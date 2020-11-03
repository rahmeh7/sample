package com.zensar.mvc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.mvc.model.Product;

@Repository
public class ProductRepositoryImpl2 implements ProductRepository {
	
	@Autowired
	private JdbcTemplate template;
	
	

	public int insertProduct(Product product) {
		System.out.println(product.getProductId()+"-"+product.getProductName()+"-"+product.getProductCost());
		String sql="insert into product(product_id,product_name,product_cost) values("+product.getProductId()+",'"+product.getProductName()+"',"+product.getProductCost()+");";
		return template.update(sql);
		
	}

}
