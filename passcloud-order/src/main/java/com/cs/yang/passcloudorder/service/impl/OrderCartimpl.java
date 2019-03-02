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
public class OrderCartimpl implements OrderCartService {

    @Resource
    public OrderCartDao orderCartDao;

    @Override
    public String DropCart(int id) {
        String msg="Success";
        try {
            orderCartDao.deleteByCartId(id);
        } catch (Exception e) {
            e.printStackTrace();
            msg="Failure";
        }
        return msg;
    }

    @Override
    public List<OrderCart> SearchAll(){
        return orderCartDao.findAll();
    }

    @Override
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
    public OrderCart SearchCartOne(int csid) {
        OrderCart orderCart=orderCartDao.findAllByCartId(csid);
        return orderCart;
    }
}
