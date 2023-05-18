package com.prodotti.progetto.finale.repository;

import com.prodotti.progetto.finale.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long> {
}
