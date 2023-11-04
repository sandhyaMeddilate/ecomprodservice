package com.example.EcomProductService.service;
import com.example.EcomProductService.DTO.ProductListResponceDTO;
import com.example.EcomProductService.DTO.ProductResponceDTO;
import com.example.EcomProductService.model.product;

public interface ProductService {
    ProductListResponceDTO getAllProducts();

    ProductResponceDTO getProductById(int id);

    product createProduct(product product);
    product deleteProduct(int id);
    product updateProduct(int id,product updatedproduct);
}
