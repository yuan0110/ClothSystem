package com.example.demo.utils;

import com.example.demo.model.Cloth;

import java.text.DecimalFormat;
import java.util.Random;

//随机生成布匹信息
public class ClothUtils {
    public static Cloth getCloth(){
        Cloth cloth = new Cloth();
        // id,price,stock
        String colorStr = "浅灰，北欧蓝，黛蓝，淡绿，卡其，暖黄，浅粉，天蓝，杏色，大红，米白，黑色";
        String nameStr = "棉麻布，碎花布，蕾丝布，绒布，丝绸，毛纺布，混纺";
        String styleStr = "单面，单层，双层，多层，厚款，花边，长款";
        String[] names = nameStr.split("，");
        String[] colors = colorStr.split("，");
        String[] styles = styleStr.split("，");
        Random random=new Random();
        DecimalFormat df = new DecimalFormat("######0.00");
        double price = 5+25*random.nextDouble();//5-30
        DecimalFormat df1 = new DecimalFormat("######0.0");
        double stock = 200+500*random.nextDouble();
        price = Double.parseDouble(df.format(price));
        stock = Double.parseDouble(df1.format(stock));
        int num = random.nextInt(1000);
        cloth.setName(names[num%names.length]);
        cloth.setColor(colors[num%colors.length]);
        cloth.setStyle(styles[num%styles.length]);
        cloth.setPrice(price);
        cloth.setStock(stock);
        return cloth;
    }
}
