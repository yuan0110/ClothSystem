package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {
    private int id;
//    private String password;
    private String name;
//    private String phone;
    private String role;
}
