package com.cs.yang.passcloudorder.controller;

import com.cs.yang.passcloudorder.dao.OrderMasterDao;
import com.cs.yang.passcloudorder.service.OrderMasterService;
import com.cs.yang.passcloudpojo.pojo.OrderMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderMasterController {

    @Autowired
    private OrderMasterService orderMasterService;


    @RequestMapping("/master/Searchall")
    public List<OrderMaster> SearchAll(){
        return orderMasterService.MasterAll();
    }
    @RequestMapping("/master/Searchall/{id}")
    public OrderMaster SearchAllById(@PathVariable("/id") int id){
        return orderMasterService.MasterAllById(id);
    }
    @RequestMapping("/master/add")
    public  String MasterAdd(){
        String msg="Success";
        OrderMaster master=new OrderMaster();
        LocalDateTime localDateTime3 = LocalDateTime.now();
        master.setOrderSn(2019021902);
        master.setCustomerId(1);
        master.setShippingUser("杨志华");
        master.setProvince(05);
        master.setCity(60);
        master.setDistrict(00);
        master.setAddress("邯郸市邯山区邯钢路11号");
        master.setPaymentMethod(4);
        master.setOrderMoney(3499.0);
        master.setDistrictMoney(0.0);
        master.setShippingMoney(100.0);
        master.setPaymentMoney(3599.0);
        master.setShippingCompName("邮政");
        master.setShippingSn("kd2019022001");
        master.setCreateTime(localDateTime3);
        master.setShipingTime(null);
        master.setPayTime(null);
        master.setReceiveTime(null);
        master.setOrderStatus(0);
        master.setOrderPoint(360);
        master.setInvoiceTime("邯郸市邯山区邯钢路11号");
        master.setModifiedTime(localDateTime3);
        return orderMasterService.MasterAdd(master);
    }
    @RequestMapping("/master/del/{id}")
    public String MasterDel(@PathVariable("id") int id){
        return orderMasterService.MasterDel(id);
    }
}
