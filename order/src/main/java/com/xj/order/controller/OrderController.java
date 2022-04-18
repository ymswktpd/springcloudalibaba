package com.xj.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 订单rest
 * @author: xijie
 * @dte: 2022/4/19
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功");
        String msg = restTemplate.getForObject("http://localhost:8080/stock/reduct", String.class);
        return "hello world"+msg;
    }


}
