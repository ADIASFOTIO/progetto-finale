package com.prodotti.progetto.finale.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.prodotti.progetto.finale.entities.Category;
import com.prodotti.progetto.finale.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryDto {
    private Long id;
    private String name;
    private String description;
    @JsonIgnore
    private List<ProductDto> productDtoList;
    public static CategoryDto convertEntityToDto(Category category){
        return CategoryDto.builder()
                .id(category.getId())
                .name(category.getName())
                .description(category.getDescription())
                .build();
    }
    public static Category convertDtoToEntity(CategoryDto dto){
        Category category = new Category();
        category.setId(dto.getId());
        category.setName(dto.getName());
        category.setDescription(dto.getDescription());
        return category;
    }
}
