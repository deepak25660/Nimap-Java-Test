package com.springrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Categories;
import com.springrest.springrest.entity.Products;
import com.springrest.springrest.services.CategoriesService;
import com.springrest.springrest.services.ProductService;

@RestController

public class MyController {
	
	@Autowired
	private CategoriesService categorieService;
	
	
	
	
	// get all Categories
	@GetMapping("/api/categories")
	
	public List<Categories> getCategoriess() {
	
	
	
		
		return this.categorieService.getCategoriess();
		
	
	}
	
	
	// get single categories
	@GetMapping("/api/categories/{categoriesId}")
	public Categories getCategories(@PathVariable String categoriesId)
	{
		return this.categorieService.getCategories(Long.parseLong(categoriesId));
	}
	// add categories
	@PostMapping("/api/categories")
	public Categories addCategories(@RequestBody Categories categories) 
	{
		return this.categorieService.addCategories(categories);
	}
	
	// update categories
	@PutMapping("/api/categories/{categoriesId}")
	public Categories UpdateCategories(@RequestBody Categories categories ,@PathVariable String categoriesId)
	{
		return this.categorieService.UpdateCategories(categories,Long.parseLong(categoriesId));
		
		
	}
	//delete the course
	@DeleteMapping("/api/categories/{categoriesId}")
	public ResponseEntity<HttpStatus> deleteCategories(@PathVariable String categoriesId ) 
{
		try {
			this.categorieService.deleteCategories(Long.parseLong(categoriesId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
			
			
		}
		
	}
	// All the products4
	  @GetMapping("/api/products")
	  public List<Products> getProduct()
	  {
		  return this.categorieService.getProduct();
	}
	  // All single product
	  @GetMapping("/api/products{productsId}")
	  public Products getProductId(@PathVariable String productId) {
		  
		  return this.categorieService.getProductId(Long.parseLong(productId));
	  }
	// add the product
	  @PostMapping("/api/products")
	  public Products addProduct(@RequestBody Products products) {
		  return this.categorieService.addProduct(products);
		  
	  }
	  // update the product
	  @PutMapping("/api/products{productId}")
	  public Products UpdateProduct(@RequestBody Products products,@PathVariable String productId) {
		  
		  return this.categorieService.UpdateProduct(products,Long.parseLong(productId));
	  }
	  // delete the product
	  @DeleteMapping("/api/products{productId}")
	  public ResponseEntity<HttpStatus> deleteProduct(@PathVariable String productId ) 
	  {
	  		try {
	  			this.categorieService.deleteProduct(Long.parseLong(productId));
	  			return new ResponseEntity<>(HttpStatus.OK);
	  		} catch (Exception e) {
	  			
	  			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	  		
	  			
	  			
	  		}
	  		
	  	}
	  
	  //pagination 
	  @GetMapping("/api/products/page/{page}/{size}")
	  
		  public List<Products> findAllWithpagination(@PathVariable int page,@PathVariable int size)
		  {
			  
			  	return this.categorieService.findAllWithpagination(page, size);
			  	
		  }
}





