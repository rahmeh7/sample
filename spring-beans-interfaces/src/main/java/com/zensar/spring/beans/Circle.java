package com.zensar.spring.beans;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Circle implements Shapeable {

	public String area() {
		
		return "This is an area of Circle";
	}

}
