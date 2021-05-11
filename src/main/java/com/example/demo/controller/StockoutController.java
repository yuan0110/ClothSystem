package com.example.demo.controller;

import com.example.demo.model.Stockout;
import com.example.demo.service.StockoutService;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequestMapping("/stockout")
public class StockoutController {
    @Autowired
    StockoutService stockoutService;

    @RequestMapping("/add")
    @ResponseBody
    public Result add(
            @RequestParam(value="id",defaultValue ="2")int id,
            @RequestParam(value="stock",defaultValue = "3")double stock,
            @RequestParam(value = "handerman",defaultValue = "haha")String handerman
    )throws IOException {
        int number = stockoutService.queryById(id);
        if(number>0)
            return Result.success();
        Stockout stockout = new Stockout();
        stockout.setId(id);
        stockout.setStock(stock);
        stockout.setHanderman(handerman);
        number = stockoutService.add(stockout);
        if(number==1){
            return Result.success();
        }
        else{
            return Result.fail();
        }
    }
}
