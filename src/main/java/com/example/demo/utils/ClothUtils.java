package com.example.demo.utils;

import com.example.demo.model.Cloth;

import java.text.DecimalFormat;
import java.util.Random;

//随机生成布匹信息
public class ClothUtils {
    public Cloth getCloth(){
        Cloth cloth = new Cloth();
        // id,price,stock
        Random random=new Random();
        DecimalFormat df = new DecimalFormat("######0.00");
        double price = 5+25*random.nextDouble();//5-30
        double stock = 200+500*random.nextDouble();
        price = Double.parseDouble(df.format(price));
        stock = Double.parseDouble(df.format(stock));
        cloth.setName("布料"+price);
        cloth.setPrice(price);
        cloth.setStock(stock);
        return cloth;
    }

    public static void main(String[] args) {
        ClothUtils clothUtils = new ClothUtils();
        clothUtils.getCloth();
    }
}
