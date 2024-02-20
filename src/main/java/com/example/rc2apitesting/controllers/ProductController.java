package com.example.rc2apitesting.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products/{id}")
    public ProductResponse devolverProducto(@PathVariable(name = "id") String id){
        return new ProductResponse(id, "secador de pelo", "89.99");
    }
    
}
