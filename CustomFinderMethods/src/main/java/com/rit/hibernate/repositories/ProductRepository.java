package com.rit.hibernate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rit.hibernate.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
