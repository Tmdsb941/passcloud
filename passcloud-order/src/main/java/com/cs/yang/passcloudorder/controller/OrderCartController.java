package com.cs.yang.passcloudorder.controller;

import com.cs.yang.passcloudorder.dao.OrderCartDao;
import com.cs.yang.passcloudorder.service.OrderCartService;
import com.cs.yang.passcloudpojo.pojo.OrderCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderCartController  {

    @Resource
    private OrderCartService orderCartService;


    @RequestMapping("/cart/all")
    public List<OrderCart> findAll(){
        return   orderCartService.SearchAll();
    }
    @RequestMapping("/cart/add")
    public String csadd(){
        OrderCart orderCart=new OrderCart();
        LocalDateTime localDateTime3 = LocalDateTime.now();
        LocalDateTime Addtimetime=localDateTime3;
        LocalDateTime Modifiedtime=localDateTime3;
        double money=3999.00;
        int Customerid=1;
        int Productid=1;
        int Producctamount=1;
        orderCart.setCustomerId(Customerid);
        orderCart.setProductId(Productid);
        orderCart.setProductAmount(Producctamount);
        orderCart.setPrice(money);
        orderCart.setAddTimetime(Addtimetime);
        orderCart.setModifiedTime(Modifiedtime);
        String msg= "Success";
        try {
            orderCartService.AddCart(orderCart);
        } catch (Exception e) {
            msg="Failure";
            e.printStackTrace();
        }
        return  msg;
    }
    @RequestMapping("/cart/dtl")
    public  String csdtl(){
        String msg="Success";
        try {
            orderCartService.DropCart(1);
        } catch (Exception e) {
            msg="Failure";
            e.printStackTrace();
        }
        return msg;
    }

    @RequestMapping("/cart/dan")
    public OrderCart csone(){
        return orderCartService.SearchCartOne(2);
    }

}
