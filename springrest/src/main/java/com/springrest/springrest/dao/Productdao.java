package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Products;

public interface Productdao extends JpaRepository<Products,Long> {

	

}
