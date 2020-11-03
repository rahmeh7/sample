package com.zensar.mvc.model;

import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor


public class Product {

	@Min(value = 100)
	private int productId;
	
	private String productName;
	
	private int productCost;
	
	
}
