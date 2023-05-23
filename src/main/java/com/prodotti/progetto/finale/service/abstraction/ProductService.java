package com.prodotti.progetto.finale.service.abstraction;

import com.prodotti.progetto.finale.dto.ProductDto;
import com.prodotti.progetto.finale.entities.Category;
import com.prodotti.progetto.finale.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
     ProductDto saveProduct(ProductDto productDto);
    ProductDto updateProduct(ProductDto productDto);
    void deleteProduct(Product product);
    void deleteProductById(Long id);
    ProductDto getProductById(Long id);
    List<ProductDto> getAllProduct();
    Optional<List<Product>> findProductByCategoryId(Long id);
    Optional<List<Product>> findProductByCode(String code);
    Optional<List<Product>> findProductByName(String name);
    Iterable<Product> findProductByNameContaining(String part);
    Iterable<Product> findProductByCategory(Category category);
    List<Product> trillProductByNameAndPrice();
    List<Product> findProductByNamePrice(String name, Double price);




}
