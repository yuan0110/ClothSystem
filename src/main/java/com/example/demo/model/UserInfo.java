package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserInfo {
    private String account;
    private String password;
    private String username;
    private String phone;
    private String role;
    private String sex;
    private int onwork;
}
