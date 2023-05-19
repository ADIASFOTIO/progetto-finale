package com.prodotti.progetto.finale.repository;

import com.prodotti.progetto.finale.entities.Category;
import com.prodotti.progetto.finale.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    Optional<List<Product>> findByCode(String code);
    Optional<List<Product>> findByName(String name);
    Iterable<Product> findByNameContainingAndIsAvailableTrue(String part);
    Iterable<Product> findByCategoryAndIsAvailableTrue(Category category);
    @Query("select p from Product p where p.name like %?1 and p.price > ?2")
    List<Product> findByNamePrice(String name, Double price);
}
