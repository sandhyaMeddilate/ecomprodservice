package com.example.EcomProductService.service;

import com.example.EcomProductService.DTO.ProductListResponceDTO;
import com.example.EcomProductService.DTO.ProductResponceDTO;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.EcomProductService.model.product;

@Service("fakestoreproductservice")
public class fakestoreproductservice implements ProductService{
    private RestTemplateBuilder restTemplateBuilder;

    @Override

    public ProductListResponceDTO getAllProducts() {
        /*String getAllProductsURL = "https://fakestoreapi.com/products";
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<ProductListResponceDTO> productResponce = restTemplate.getForEntity(getAllProductsURL,ProductListResponceDTO.class);
        return productResponce.getBody();*/
        return null;
    }

    @Override
    public ProductResponceDTO getProductById(int id) {
        String getAllProductsURL = "https://fakestoreapi.com/products/"+id;
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<ProductResponceDTO> productResponce = restTemplate.getForEntity(getAllProductsURL,ProductResponceDTO.class);
        return productResponce.getBody();
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
