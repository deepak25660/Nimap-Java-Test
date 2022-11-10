package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.entity.Categories;
import com.springrest.springrest.entity.Products;



public interface CategoriesService {

	public List<Categories> getCategoriess();
	public  Categories getCategories(long categoriesId);
	public  Categories addCategories(Categories categories);
	public Categories UpdateCategories(Categories categories,long categoriesId);
	public void deleteCategories(long parselong);
	
	public List<Products> getProduct();
	public Products getProductId(long productId);
	public Products addProduct(Products products);
	public Products UpdateProduct(Products products,long productId);
	public void deleteProduct(long parselong);
}