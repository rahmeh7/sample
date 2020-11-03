package com.zensar.spring.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zensar.spring.beans.Product;
import com.zensar.spring.repository.ProductRepository;

@Service("service")
public class ProductServiceImpl1 implements ProductService {

	@Autowired
	@Qualifier("productRepositoryImpl1")
	private ProductRepository repositoryImpl;

	/*
	 * public ProductServiceImpl1(ProductRepository repository) { System.out.
	 * println("inside public ProductServiceImpl1(ProductRepository repository) !!!"
	 * ); this.repositoryImpl=repository; }
	 */
	public int insertProduct(Product product) {

		return repositoryImpl.insertProduct(product);
	}

	/*
	 * public ProductRepository getRepositoryImpl() { return repositoryImpl; }
	 * 
	 * public void setRepositoryImpl(ProductRepository repositoryImpl) { System.out.
	 * println("inside public void setRepositoryImpl(ProductRepository repositoryImpl !!)"
	 * ); this.repositoryImpl = repositoryImpl; }
	 */

	@PostConstruct
	public void myInit() {
		System.out.println("inside myInit() !!!");
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println(" inside myDestroy()");
	}

	public List<Product> getAllProducts() {
		
		return repositoryImpl.getAllProducts();
	}

}
