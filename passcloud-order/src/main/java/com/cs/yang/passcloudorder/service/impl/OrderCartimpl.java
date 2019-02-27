package com.cs.yang.passcloudorder.service.impl;

import com.cs.yang.passcloudorder.dao.OrderCartDao;
import com.cs.yang.passcloudorder.service.OrderCartService;
import com.cs.yang.passcloudpojo.pojo.OrderCart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderCartimpl implements OrderCartService {

    @Resource
    public OrderCartDao orderCartDao;

    @Override
    @GetMapping("/cart/delete/{id}")
    public String DropCart(int id) {
        String msg="Success";
        try {
            orderCartDao.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            msg="Failure";
        }
        return msg;
    }

    @Override
    @GetMapping("/cart/findall")
    public List<OrderCart> SearchAll(){
        return orderCartDao.findAll();
    }

    @Override
    @GetMapping("/cart/add/{cart}")
    public String AddCart(@PathVariable("cart") OrderCart cart) {
        String msg="Success";
        OrderCart orderCart=new OrderCart(cart);
        try {
            orderCartDao.save(orderCart);
        } catch (Exception e) {
            msg="Failure";
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    @GetMapping("/cart/{id}")
    public OrderCart SearchCartOne(int csid) {
        OrderCart orderCart=orderCartDao.findById(csid).get();
        return orderCart;
    }
}
