package com.cs.yang.passcloudorder.service.impl;

import com.cs.yang.passcloudorder.dao.OrderMasterDao;
import com.cs.yang.passcloudorder.service.OrderMasterService;
import com.cs.yang.passcloudpojo.pojo.OrderMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/order")
@RestController
public class OrderMasterimpl implements OrderMasterService {


    @Autowired
    private OrderMasterDao orderMasterDao;

    @Override
    public String MasterAdd(OrderMaster master) {
        String msg="Success";
        try {
            orderMasterDao.save(master);
        } catch (Exception e) {
            msg="Failure";
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public String MasterDel(int id) {
        String msg="Success";
        try {
            orderMasterDao.deleteById(id);
        } catch (Exception e) {
            msg="Failure";
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public List<OrderMaster> MasterAll() {
        return orderMasterDao.findAll();
    }
    @Override
    public OrderMaster MasterAllById(@PathVariable("id") int id) {
        return orderMasterDao.findById(id).get();
    }
}
