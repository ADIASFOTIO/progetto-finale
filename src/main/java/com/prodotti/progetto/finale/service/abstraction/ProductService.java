package com.prodotti.progetto.finale.service.abstraction;

import com.prodotti.progetto.finale.entities.Category;
import com.prodotti.progetto.finale.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
     Product saveProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Product product);
    void deleteProductById(Long id);
    Optional<Product> getProductById(Long id);
    List<Product> getAllProduct();
    Iterable<Product> findWithNameAndPrice(String name, Double price);
    Optional<List<Product>> findProductByCode(String code);
    Optional<List<Product>> findProductByName(String name);
    Iterable<Product> findProductByNameContainingAndIsAvailableTrue(String part);
    Iterable<Product> findProductByCategoryAndIsAvailableTrue(Category category);




}
