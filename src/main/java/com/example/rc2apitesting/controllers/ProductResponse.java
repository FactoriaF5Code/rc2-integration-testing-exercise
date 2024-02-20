package com.example.rc2apitesting.controllers;

public class ProductResponse {
    private String id;
    private String name;
    private String price;
    
    public ProductResponse(String id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    } 

    

    
}
