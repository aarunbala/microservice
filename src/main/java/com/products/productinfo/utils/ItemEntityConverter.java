package com.products.productinfo.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.products.productinfo.domain.ItemEntity;
import com.products.productinfo.model.Item;

public class ItemEntityConverter {
	
	public static Item convertEntity(ItemEntity entity) {
		if(entity == null) {
			return null;
		}
		Item item = new Item();
		BeanUtils.copyProperties(entity, item);
		return item;
	}
	
	public static ItemEntity convertItem( Item item) {
		if(item == null) {
			 return null;
		}
		ItemEntity entity = new ItemEntity();
		BeanUtils.copyProperties(item, entity);
		return entity;
	}

	public static List<ItemEntity> convertItems(List<Item> items) {
		if(items == null) {
			return null;
		}
		List<ItemEntity> entities = new ArrayList<>();
		for(Item item:items) {
			entities.add(convertItem(item));
		}
		return entities;
	}
	
	public static List<Item> convertEntities(List<ItemEntity> entities) {
		if(entities == null) {
			return null;
		}
		List<Item> items = new ArrayList<>();
		for(ItemEntity entity: entities) {
			items.add(convertEntity(entity));
		}
		return items;
	}
}
