package com.springrest.springrest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Categories;

public interface categoriesdao extends JpaRepository<Categories, Long>  {

}