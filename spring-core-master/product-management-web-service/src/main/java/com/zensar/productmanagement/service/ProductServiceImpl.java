package com.zensar.productmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.productmanagement.beans.Product;
import com.zensar.productmanagement.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public Iterable<Product> getAllProducts() {
		return repository.findAll();
	}

	@Override
	public Product getProduct(int productId) {
		return repository.findById(productId).get(); // 2.3.4.RELEASE
		// return repository.findOne(productId);  //1.5.4.RELEASE
	}

	@Override
	public Product insertProduct(Product product) {
		return repository.save(product);
	}

	@Override
	public void deleteProduct(int productId) {
		 repository.deleteById(productId);  // 2.3.4.RELEASE
		// repository.delete(productId);  //1.5.4.RELEASE
		
	}

	@Override
	public void updateProduct(int productId, Product updatedProduct) {
		Product product = repository.findById(productId).get();  //2.3.4.RELEASE
		
		//Product product =repository.findOne(productId);   // 1.5.4.RELEASE
		
		product.setProductId(updatedProduct.getProductId());
		product.setProductName(updatedProduct.getProductName());
		product.setProductCost(updatedProduct.getProductCost());
		repository.save(product);
	}

	@Override
	public List<Product> getProductByName(String productName) {
		return repository.giveMeProduct(productName);
	}

}
