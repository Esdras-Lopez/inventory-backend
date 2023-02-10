package com.company.inventory.inventory.services;

import org.springframework.http.ResponseEntity;

import com.company.inventory.inventory.response.CategoryResponseRest;

public interface IcategoryService {
	public ResponseEntity<CategoryResponseRest> search();

}
