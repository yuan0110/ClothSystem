package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Stockout {
    private int id;
    private double stock;
    private String handerman;
}
