package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.Productdao;
import com.springrest.springrest.dao.categoriesdao;
import com.springrest.springrest.entity.Categories;
import com.springrest.springrest.entity.Products;

@Service

public class CategoriesSeviceimpl implements CategoriesService {
	
	@Autowired
	private categoriesdao categoriesDao;
	@Autowired
	private Productdao productDao;
	
	
	//List<Categories> list;
	 public CategoriesSeviceimpl() {
		 
		
	 }

	@Override
	public List<Categories> getCategoriess() {
		
		return categoriesDao.findAll();
	}


	@Override
	public Categories getCategories(long categoriesId) {
		// TODO Auto-generated method stub
		//
		
		return categoriesDao.getOne(categoriesId);
	}
	

	@Override
	public Categories addCategories(Categories categories) {
		// TODO Auto-generated method stub
		//list.add(categories);
		categoriesDao.save(categories);
		
		return categories;
	}

	

	@Override
	public void deleteCategories(long parselong) {
		// TODO Auto-generated method stub
		 @SuppressWarnings("deprecation")
		Categories entity =categoriesDao.getOne(parselong);
		 categoriesDao.delete(entity);
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public Categories UpdateCategories(Categories categories, long categoriesId) {
		// TODO Auto-generated method stub
		categoriesDao.getOne(categoriesId);
           categoriesDao.save(categories);
		
		return categories;
	}

	@Override
	public List<Products> getProduct() {
		// TODO Auto-generated method stub
		return productDao.findAll();
		}

	@SuppressWarnings("deprecation")
	@Override
	public Products getProductId(long productId) {
		// TODO Auto-generated method stub
		return productDao.getOne(productId);
	}

	@Override
	public Products addProduct(Products products) {
		// TODO Auto-generated method stub
		productDao.save(products);
		
		return products;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Products UpdateProduct(Products products, long productId) {
		// TODO Auto-generated method stub
		productDao.getOne(productId);
		productDao.save(products);
		
		return products;
	}

	@Override
	public void deleteProduct(long parselong) {
		// TODO Auto-generated method stub
		 @SuppressWarnings("deprecation")
		Products entity =productDao.getOne(parselong);
		 productDao.delete(entity);
	}

	@Override
	public List<Products> findAllWithpagination(int page, int size) {
		// TODO Auto-generated method stub
		Pageable paging=PageRequest.of(page, size);
		Page<Products> pageResult = productDao.findAll(paging);
		return pageResult.toList();
		
	}

	
	
		
		
	
	
	

}
