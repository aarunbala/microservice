package com.products.productinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.productinfo.model.ProductDetails;
import com.products.productinfo.service.ProductDetailsService;

@RestController
public class ProductDetailsController {
	
	@Autowired
	private ProductDetailsService service;
	
	@CrossOrigin
	@GetMapping(path="/getProducts")
	public List<ProductDetails> getAllProducts() {
		return service.getAllProducts();
	}

}
