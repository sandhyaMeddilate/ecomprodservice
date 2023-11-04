package com.example.EcomProductService.Controller;

import com.example.EcomProductService.DTO.ProductListResponceDTO;
import com.example.EcomProductService.DTO.ProductResponceDTO;
import com.example.EcomProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import com.example.EcomProductService.model.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

public class ProductController {
    @Qualifier("fakestoreproductservice")

    @Autowired
    private ProductService productService;

    @GetMapping("/products/1")
    public ResponseEntity getProductFromId(){
        /*ProductResponceDTO p1 = new ProductResponceDTO();
        p1.setId(1);
        p1.setTitle("Iphone 15 pro");
        p1.setPrice(150000);
        p1.setImage("www.google.come/image/iphone 15 pro");
        p1.setDescription("Craving for it");
        p1.setCategory("Electronics");

        ProductResponceDTO p2 = new ProductResponceDTO();
        p2.setId(2);
        p2.setTitle("Iphone 14 pro");
        p2.setPrice(100000);
        p2.setImage("www.google.come/image/iphone 14 pro");
        p2.setDescription("Craving for it");
        p2.setCategory("Electronics");

        List<ProductResponceDTO> products = Arrays.asList(p1,p2);
        return ResponseEntity.ok(products);
        */
        ProductResponceDTO responce = productService.getProductById(1);
        return ResponseEntity.ok(responce);

    }
}
