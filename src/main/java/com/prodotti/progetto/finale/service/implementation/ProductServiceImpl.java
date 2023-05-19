package com.prodotti.progetto.finale.service.implementation;

import com.prodotti.progetto.finale.entities.Category;
import com.prodotti.progetto.finale.entities.Product;
import com.prodotti.progetto.finale.repository.ProductRepository;
import com.prodotti.progetto.finale.service.abstraction.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }
    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }
    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
    @Override
    public Optional<List<Product>> findProductByCategoryId(Long id) {
        return productRepository.findByCategoryId(id);
    }
    @Override
    public Optional<List<Product>> findProductByCode(String code) {
        return productRepository.findByCode(code);
    }
    @Override
    public Optional<List<Product>> findProductByName(String name) {
        return productRepository.findByName(name);
    }
    @Override
    public Iterable<Product> findProductByNameContaining(String part) {
        return productRepository.findByNameContaining(part);
    }
    @Override
    public Iterable<Product> findProductByCategory(Category category) {
        return productRepository.findByCategory(category);
    }
    @Override
    public List<Product> trillProductByNameAndPrice() {
        return productRepository.trillByNameAndPrice();
    }
    @Override
    public List<Product> findProductByNamePrice(String name, Double price) {
        return productRepository.findByNamePrice(name, price);
    }
}
