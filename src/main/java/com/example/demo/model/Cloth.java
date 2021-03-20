package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Cloth {
    @Id
    private int id;
    private String name;
    private double price;
    private double stock;
}

