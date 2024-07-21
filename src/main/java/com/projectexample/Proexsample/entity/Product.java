package com.projectexample.Proexsample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String description;

    private String category;

    private String brand;

    private String supplier;

    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public String getdescription() {
        return description;
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public String getcategory() {
        return category;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getbrand() {
        return brand;
    }

    public void setsupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getsupplier() {
        return supplier;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getcolor() {
        return color;
    }

}
