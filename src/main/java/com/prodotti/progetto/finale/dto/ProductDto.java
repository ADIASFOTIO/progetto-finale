package com.prodotti.progetto.finale.dto;
import com.prodotti.progetto.finale.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
    private Long id;
    private String code;
    private String name;
    private Double price;
    private Date creationDate;
    private CategoryDto categoryDto;
    public static ProductDto convertEntityToDto(Product product){
        return ProductDto.builder()
                .id(product.getId())
                .code(product.getCode())
                .name(product.getName())
                .creationDate(product.getCreationDate())
                .price(product.getPrice())
                .categoryDto(CategoryDto.convertEntityToDto(product.getCategory()))
                .build();

    }
    public static Product convertDtoToEntity(ProductDto dto){
        Product product = new Product();
         product.setId(dto.getId());
         product.setCode(dto.getCode());
         product.setName(dto.getName());
         product.setCreationDate(dto.getCreationDate());
         product.setCategory(CategoryDto.convertDtoToEntity(dto.getCategoryDto()));
         return product;
    }
}
