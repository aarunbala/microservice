package com.products.productinfo.model;

import java.time.LocalDateTime;

public class Item {
	private String product;
	private String description;
	private Integer quantity;
	private String units;
	private String shop;
	private String date;
	private String category;
	private Double price;
	
	
	public Item(String product, String description, Integer quantity, String units, String shop, String date,
			String category, Double price) {
		super();
		this.product = product;
		this.description = description;
		this.quantity = quantity;
		this.units = units;
		this.shop = shop;
		this.date = date;
		this.category = category;
		this.price = price;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		category = category;
	}
	
}
