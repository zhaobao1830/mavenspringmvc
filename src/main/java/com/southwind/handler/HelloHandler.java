package com.southwind.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloHandler {

    @RequestMapping(value = "/index")
    public String index(@RequestParam("name") String name, @RequestParam("id") int id){
        System.out.println("执行index业务代码");
        System.out.println("name为："+name);
        int nid = id + 10;
        System.out.println("nide："+nid);
        return "index";
    }

    @RequestMapping(value = "rest/{name}")
    public String index(@PathVariable("name") String name){
        System.out.println("执行index业务代码");
        System.out.println("name为："+name);
        return "index";
    }

    @RequestMapping(value = "user")
    public String addUser(){
        System.out.println("执行addUser业务代码");
        return "addUser";
    }
}