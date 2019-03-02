package com.cs.yang.passcloudorder.controller;

import com.cs.yang.passcloudorder.dao.OrderDetialDao;
import com.cs.yang.passcloudpojo.pojo.OrderDetial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/order")
@RestController
public class OrderDetialController {
    //订单详情
    @Autowired
    private OrderDetialDao orderDetialDao;

    @RequestMapping("/detial/{id}")
    public String OrderDetialSave(@PathVariable("id") int id){
        String msg="Success";
        try {
            orderDetialDao.deleteByOrderDetailId(id);
        } catch (Exception e) {
            msg="shibai";
            e.printStackTrace();
        }
        return msg;
    }
    @RequestMapping("/SearchAll")
    public List<OrderDetial> SearchALL(){
        return orderDetialDao.findAll();
    }
    @RequestMapping("/SearchOne/{id}")
    public OrderDetial SearchOne(@PathVariable("id") int id){
        return orderDetialDao.findAllByOrderDetailId(id);
    }

}
