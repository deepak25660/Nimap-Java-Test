package com.springrest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
	private long id;
	private String categorgyname;
	private String productname;
	private long productprice;
	public Products(long id, String categorgyname, String productname, long productprice) {
		super();
		this.id = id;
		this.categorgyname = categorgyname;
		this.productname = productname;
		this.productprice = productprice;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCategorgyname() {
		return categorgyname;
	}
	public void setCategorgyname(String categorgyname) {
		this.categorgyname = categorgyname;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public long getProductprice() {
		return productprice;
	}
	public void setProductprice(long productprice) {
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", categorgyname=" + categorgyname + ", productname=" + productname
				+ ", productprice=" + productprice + "]";
	}
	

}
