package com.rit.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rit.hibernate.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
