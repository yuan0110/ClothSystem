package com.example.demo.controller;

import com.example.demo.model.Cloth;
import com.example.demo.service.ClothService;
import com.example.demo.utils.ClothUtils;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/cloth")
public class ClothController {

    @Autowired
    ClothService clothService;

    @RequestMapping("/list")
    @ResponseBody
    public Result list(Model model, @RequestParam(value="page",defaultValue = "1")int start,
                       @RequestParam(value="limit",defaultValue = "10")int size,
                       @RequestParam(value = "name",defaultValue = "所有布料")String name)throws Exception{
        //page分页规则
//        PageHelper pageHelper = new PageHelperConfig().pageHelper();
        PageHelper.startPage(start,size);
//        PageHelper.startPage()
        //获取cloth数据
        List<Cloth> cloths = new ArrayList<>();
        if(name.equals("所有布料"))
        {
            cloths = clothService.queryAll();
        }
        else{
            cloths = clothService.queryByName(name);
        }
        PageInfo<Cloth> page = new PageInfo<>(cloths);
        return Result.data((int)page.getTotal(),page.getList());
    }

    @RequestMapping("/listall")
    public String queryAll(Model model, @RequestParam(value="start",defaultValue = "1")int start,
                           @RequestParam(value="size",defaultValue = "10")int size)throws Exception{
        //page分页规则
//        PageHelper pageHelper = new PageHelperConfig().pageHelper();
        PageHelper.startPage(start,size);
//        PageHelper.startPage()
        //获取cloth数据
        List<Cloth> cloths = clothService.queryAll();

        PageInfo<Cloth> page = new PageInfo<>(cloths);
        model.addAttribute("page",page);

        return "cloth";

    }

    @RequestMapping("/querybyid")
    @ResponseBody
    Cloth queryById(int id){//这个id通过  ？id=  获取
        return clothService.queryById(id);
    }


    @RequestMapping("/querybyname")
    @ResponseBody
    List<Cloth> queryByName(String name){
        return clothService.queryByName(name);
    }

    @RequestMapping("/updatebyid")
    @ResponseBody
    String updateById(Cloth cloth){
        return clothService.updatePriceById(cloth)==1? "success":"failed";
    }

    @RequestMapping("/add")
    @ResponseBody
    int add(@RequestParam(value = "num",defaultValue = "1")int num)throws IOException {
        int count=0;
        for(int i=0;i<num;++i)
        {
            Cloth cloth= new ClothUtils().getCloth();
            count += clothService.add(cloth);
        }
        return count;
    }

}
