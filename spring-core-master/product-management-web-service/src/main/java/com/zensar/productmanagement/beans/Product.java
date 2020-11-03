package com.zensar.productmanagement.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
//@NamedQuery(name = "Product.giveMeProduct", query = "from Product p where p.productName = ?1")
/*@NamedQueries(value= 
				{@NamedQuery(name = "Product.giveMeProduct", query = "from Product p where p.productName = ?1"),
					@NamedQuery(name = "Product.giveMeProductOnCost", query = "from Product p where p.productCost = ?1")
				}) */

//@NamedNativeQuery(name = "Product.giveMeProduct", query = "select * from Product where product_name = ?1",resultClass = Product.class)
public class Product {

	@Id
	private int productId;
	
	private String productName;
	private int productCost;
	
	
	public Product() {
		super();
	}
	public Product(int productId, String productName, int productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ "]";
	}
	
	
}
