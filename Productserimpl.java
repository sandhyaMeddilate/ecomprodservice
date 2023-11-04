package com.example.EcomProductService.service;
import com.example.EcomProductService.DTO.ProductListResponceDTO;
import com.example.EcomProductService.DTO.ProductResponceDTO;
import com.example.EcomProductService.model.product;
import org.springframework.stereotype.Service;

@Service("productservice")
public class Productserimpl implements ProductService {

    @Override
    public ProductListResponceDTO getAllProducts() {
        return null;
    }

    @Override
    public ProductResponceDTO getProductById(int id) {
        return null;
    }

    @Override
    public product createProduct(product product) {
        return null;
    }

    @Override
    public product deleteProduct(int id) {
        return null;
    }

    @Override
    public product updateProduct(int id, product updatedproduct) {
        return null;
    }
}
