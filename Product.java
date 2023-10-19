package com.xworkz.dmart;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@AllArgsConstructor
@Getter




public class Product {

    private int productId;
    private String productName;
    private double price;
    private String category;
    private String description;
    private int quantityInStock;
    private String manufacturer;
    private String supplier;
    private String barcode;

}

