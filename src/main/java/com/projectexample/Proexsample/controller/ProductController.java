package com.projectexample.Proexsample.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectexample.Proexsample.dto.Product;

@RestController
@CrossOrigin
@RequestMapping("api/v1/product")
public class ProductController {
    ArrayList<String> products = new ArrayList<>();

    @GetMapping
    public ArrayList<String> getProduct() {
        return products;
    }

    @PostMapping
    public String saveProduct(@RequestBody Product product) {
        products.add(product.getName());
        return"Product Saved Successfully";
    }
}
