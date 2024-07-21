package com.projectexample.Proexsample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {
    private String name;

    private String description;

    private String category;

    private String brand;

    private String supplier;

    private String color;
}
