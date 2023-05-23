package com.prodotti.progetto.finale.restController;

import com.prodotti.progetto.finale.dto.ProductDto;
import com.prodotti.progetto.finale.entities.Product;
import com.prodotti.progetto.finale.service.abstraction.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductRestController {
    private ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<ProductDto> getAllProduct() {
        return productService.getAllProduct();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ProductDto getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public ProductDto createProduct(@RequestBody ProductDto productDto) {

        return productService.saveProduct(productDto);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public ProductDto updateProduct(@RequestBody ProductDto productDto) {
        return productService.updateProduct(productDto);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProductById(id);
    }
    @RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
    public List<Product> getProductsByCatId(@PathVariable("idCat") Long idCat) {
        return productService.findProductByCategoryId(idCat).get();
    }
}