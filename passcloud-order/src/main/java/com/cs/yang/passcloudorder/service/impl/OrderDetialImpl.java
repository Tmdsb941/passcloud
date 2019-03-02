package com.cs.yang.passcloudorder.service.impl;

import com.cs.yang.passcloudorder.dao.OrderDetialDao;
import com.cs.yang.passcloudorder.service.OrderDetialService;
import com.cs.yang.passcloudpojo.pojo.OrderDetial;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class OrderDetialImpl implements OrderDetialService {

    @Autowired
    OrderDetialDao orderDetialDao;

    @Override
    public List<OrderDetial> quanbu() {
        return orderDetialDao.findAll();
    }

    @Override
    public OrderDetial dange(int id) {
        return orderDetialDao.findAllByOrderDetailId(id);
    }

    @Override
    public String deleteid(int id) {
        String msg="Success";
        try {
            orderDetialDao.deleteByOrderDetailId(id);
        } catch (Exception e) {
            e.printStackTrace();
            msg="shibai";
        }
        return msg;
    }


}
