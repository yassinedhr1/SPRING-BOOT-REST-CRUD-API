package com.ecomApp.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomApp.crud.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
