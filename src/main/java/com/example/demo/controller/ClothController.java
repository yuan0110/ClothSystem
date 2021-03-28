package com.example.demo.controller;

import com.example.demo.mapper.ClothMapper;
import com.example.demo.model.Cloth;
import com.example.demo.service.ClothService;
import com.example.demo.utils.ClothUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloth")
public class ClothController {

    @Autowired
    ClothService clothService;

    @RequestMapping("/querybyid")
    Cloth queryById(int id){//这个id通过  ？id=  获取
        return clothService.queryById(id);
    }


    @RequestMapping("querybyname")
    Cloth queryByName(String name){
        return clothService.queryByname(name);
    }

    @RequestMapping("/updatebyid")
    String updateById(Cloth cloth){
        return clothService.updatePriceById(cloth)==1? "success":"failed";
    }

    @RequestMapping("/add")
    String add(){
        Cloth cloth=new ClothUtils().getCloth();
        return clothService.add(cloth)==1 ? "success" : "failed";
    }

}
