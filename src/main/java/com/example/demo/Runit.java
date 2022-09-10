package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Runit {
    @RequestMapping("add")
    public String add(int a, int b){
        return "a" + a + b;
    }

    @RequestMapping("/bbbb")
    public String aaab(Integer a){


        return Math.pow(a,2) + "";
    }


    @RequestMapping("add2")
    public String add2(int a, int b){
        return "a" + a + b;
    }
    @RequestMapping("/add3")
    public String add3(int a, int b){
        return "a" + a + b;
    }


}
