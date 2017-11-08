package com.products.productinfo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Span;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.productinfo.model.Item;
import com.products.productinfo.service.ItemService;

@RestController
@CrossOrigin
@RequestMapping(path = "/itemManager")
public class ItemController {

	private static Logger LOGGER = LoggerFactory.getLogger(ItemController.class);

	@Autowired
	private ItemService service;

	@Autowired
	private Tracer tracer;

	@GetMapping(path = "/getAllItems")
	public List<Item> getAllItems() {

		Span.SpanBuilder builder = Span.builder().traceId(Span.hexToId("111111111111111111111111111"));
		Span start = builder.build();
		this.tracer.createSpan("abc", start);

		/*
		 * List<Item> items = new ArrayList<>(); IntStream.range(0, 10).forEach(i -> {
		 * Item item1 = new Item(i * 10, "Milk", "Milk 3L", 3, "L", "Woolworths",
		 * "2017-10-27", "Grocery", 3.50); Item item2 = new Item(i * 11, "Curd", "Curd",
		 * 2, "L", "Woolworths", "2017-10-28", "Grocery", 4.50); Item item3 = new Item(i
		 * * 12, "Butter", "Milk 3L", 500, "gms", "Woolworths", "2017-10-27", "Grocery",
		 * 5.50); Item item4 = new Item(i * 13, "Cheese", "Curd", 250, "gms",
		 * "Woolworths", "2017-10-28", "Grocery", 6.50); Item item5 = new Item(i * 14,
		 * "Egg", "Egg case", 700, "gms", "Woolworths", "2017-10-27", "Grocery", 14.50);
		 * service.addItem(item1); service.addItem(item2); service.addItem(item3);
		 * service.addItem(item4); service.addItem(item5); });
		 */
		/*
		 * Item item1 = new Item("Milk", "Milk 3L", 3, "L","Woolworths","2017-10-27",
		 * "Grocery", 4.50); Item item2 = new Item("Curd", "Curd", 2,
		 * "L","Woolworths","2017-10-28", "Grocery", 8.50); Item item3 = new
		 * Item("Butter", "Milk 3L", 500, "gms","Woolworths","2017-10-27", "Grocery",
		 * 4.50); Item item4 = new Item("Cheese", "Curd", 250,
		 * "gms","Woolworths","2017-10-28", "Grocery", 8.50); Item item5 = new
		 * Item("Egg", "Egg case", 700, "gms","Woolworths","2017-10-27", "Grocery",
		 * 4.50); items.add(item1); items.add(item2); items.add(item3);
		 * items.add(item4); items.add(item5);
		 */
		List<Item> items = service.getAllItems();
		LOGGER.info(items.toString());
		return items;
	}

	@GetMapping(path = "/getTotalPrice")
	public Double getTotalPrice() {
		return new Double(13.00);
	}
}
