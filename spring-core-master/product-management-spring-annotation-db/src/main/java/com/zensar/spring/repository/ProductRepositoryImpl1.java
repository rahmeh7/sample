package com.zensar.spring.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zensar.spring.beans.Product;

@Repository
public class ProductRepositoryImpl1 implements ProductRepository {

	@Autowired
	private JdbcTemplate template;

	public int insertProduct(final  Product product) {
		
		//createTable();
		String sql="insert into product values(?,?,?)";
		return template.execute(sql,new PreparedStatementCallback<Integer>() {

			public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, product.getProductId());
				ps.setString(2, product.getProductName());
				ps.setInt(3, product.getProductCost());
				
				ps.execute();
				return 1;
			
			}
		
		});
		
	
		
	}

	/* public List<Product> getAllProducts() {
		return template.query("select * from product", new ResultSetExtractor<List<Product>>() {

			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<Product> products = new ArrayList<Product>();
				while (rs.next()) {
					Product product = new Product();
					product.setProductId(rs.getInt(1));
					product.setProductName(rs.getString(2));
					product.setProductCost(rs.getInt(3));

					products.add(product);

				}
				return products;
			}
		});
	}  */
	
	
	public List<Product> getAllProducts() {
		return template.query("select * from product",new MyRowMapper());
	}


	public void createTable() {
		template.execute("create table product(productId int ,productName varchar(50),productCost int)");
	}

	/*
	 * public JdbcTemplate getTemplate() { return template; }
	 * 
	 * 
	 * public void setTemplate(JdbcTemplate template) { this.template = template; }
	 */

}
