package com.products.productinfo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Span;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Service;

import com.products.productinfo.model.Item;
import com.products.productinfo.repository.ItemJpaRepository;
import com.products.productinfo.utils.ItemEntityConverter;

@Service
public class ItemService {
	private static Logger LOGGER = LoggerFactory.getLogger(ItemService.class);
	@Autowired
	private ItemJpaRepository repository;

	@Autowired
	private Tracer tracer;

	public List<Item> getAllItems() {
		LOGGER.debug("Inside Get All Items");
		Span newSpan = this.tracer.createSpan("DB call");
		LOGGER.debug("Calling DB");
		List<Item> items = ItemEntityConverter.convertEntities(this.repository.findAll());
		this.tracer.close(newSpan);
		return items;
	}

	public Item addItem(Item item) {
		return ItemEntityConverter.convertEntity(repository.saveAndFlush(ItemEntityConverter.convertItem(item)));
	}

}
