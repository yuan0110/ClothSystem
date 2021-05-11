package com.example.demo.utils;

import java.util.HashMap;
import java.util.List;

public class Result extends HashMap<String, Object> {
    public static Result data(Integer count, List<?> data){
        Result r = new Result();
        r.put("code", 0);
        r.put("msg", "");
        r.put("count", count);
        r.put("data", data);
        return r;
    }
    public static Result success(Integer count,List<?> data){
        Result r = new Result();
        r.put("code", 0);
        r.put("msg","success");
        r.put("count",count);
        r.put("data",data);
        return r;
    }
    public static Result fail(){
        Result r = new Result();
        r.put("code", -1);
        r.put("msg","fail");
        r.put("count",0);
        r.put("data",null);
        return r;
    }
    public static Result success(){
        Result r = new Result();
        r.put("code", 0);
        r.put("msg","success");
        r.put("count",0);
        r.put("data",null);
        return r;
    }

}
