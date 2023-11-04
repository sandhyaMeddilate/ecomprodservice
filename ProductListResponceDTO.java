package com.example.EcomProductService.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProductListResponceDTO {
    private List<ProductResponceDTO> products;

    public ProductListResponceDTO(){
        this.products = new ArrayList<>();
    }
}
