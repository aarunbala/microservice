package com.products.productinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.productinfo.domain.ItemEntity;

public interface ItemJpaRepository extends JpaRepository<ItemEntity, Long>{

}
