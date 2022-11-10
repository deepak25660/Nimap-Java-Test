package com.springrest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categories {
	
	@Id
	private long id;
	
	private String categorisename;

	public Categories(long id, String categorisename) {
		super();
		this.id = id;
		this.categorisename = categorisename;
	}

	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategorisename() {
		return categorisename;
	}

	public void setCategorisename(String categorisename) {
		this.categorisename = categorisename;
	}

	@Override
	public String toString() {
		return "Categories [id=" + id + ", categorisename=" + categorisename + "]";
	}
	

}
