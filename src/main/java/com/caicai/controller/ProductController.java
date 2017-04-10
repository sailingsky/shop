package com.caicai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shuangjian on 2017/4/10.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/hello")
    public void hello(){
        System.out.println("hello");
    }
}
