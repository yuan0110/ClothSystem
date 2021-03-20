package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;


@Data
@NoArgsConstructor
public class Order {
    @Id
    private int id;
    private String client;
    private Timestamp producetime;
    private String cname;//布料的名称
    private double cprice;
    private double cnumber;
    private double csum;
    private String handerman;
    private String deliveryman;
    private Timestamp endtime;

}
