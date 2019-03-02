package com.cs.yang.passcloudeurekaribbon.controller;

import com.cs.yang.passcloudeurekaribbon.service.GoodsService;
import com.cs.yang.passcloudpojo.pojo.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @RequestMapping(value = "/goods")
    public List<ProductInfo> quanbu(){
        return goodsService.getAll();
    }
}
