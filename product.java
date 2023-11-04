package com.example.EcomProductService.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class product {
    private int id;
    private String title;
    private double price;
    private String Category;
    private String description;
    private String image;
}