package com.products.productinfo.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.productinfo.model.Item;

@RestController
@CrossOrigin
@RequestMapping(path="/itemManager")
public class ItemController {

	@GetMapping(path="/getAllItems")
	public List<Item> getAllItems() {
		List<Item> items = new ArrayList<>();
		Item item1 = new Item("Milk", "Milk 3L", 3, "L","Woolworths","2017-10-27", "Grocery", 4.50); 
		Item item2 = new Item("Curd", "Curd", 2, "L","Woolworths","2017-10-28", "Grocery", 8.50); 
		items.add(item1); items.add(item2);
		return items;
	}
}
