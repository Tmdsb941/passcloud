package com.cs.yang.passcloudorder.controller;

import com.cs.yang.passcloudorder.dao.OrderDetialDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RestController
public class OrderDetialController {
    @Autowired
    private OrderDetialDao orderDetialDao;

//    @RequestMapping("/detial/")
//    public String OrderDetialSave(){
//        return "";
//    }
}
