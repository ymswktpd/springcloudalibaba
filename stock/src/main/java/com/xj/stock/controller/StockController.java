package com.xj.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 库存rest
 * @author: xijie
 * @dte: 2022/4/19
 */
@RestController
@RequestMapping("/stock")
public class StockController {


        @RequestMapping("/reduct")
        public String add(){
            System.out.println("扣减库存");
            return "扣减库存";
        }
    }
