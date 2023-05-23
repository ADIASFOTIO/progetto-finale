package com.prodotti.progetto.finale.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nameProd", types = {Product.class})
public interface ProductProjection {
    public String getName();
    public Double getPrice();
}
