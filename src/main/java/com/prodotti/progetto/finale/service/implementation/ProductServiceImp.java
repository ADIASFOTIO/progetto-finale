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
public class ProductServiceImp implements ProductService {
    ProductRepository productRepository;
    @Autowired
    public ProductServiceImp(ProductRepository productRepository) {
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
    public List<Product> findWithNameAndPrice(String name, Double price) {
        return productRepository.findByNamePrice(name, price);
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
    public Iterable<Product> findProductByNameContainingAndIsAvailableTrue(String part) {
        return productRepository.findByNameContainingAndIsAvailableTrue(part);
    }
    @Override
    public Iterable<Product> findProductByCategoryAndIsAvailableTrue(Category category) {
        return productRepository.findByCategoryAndIsAvailableTrue(category);
    }

}
