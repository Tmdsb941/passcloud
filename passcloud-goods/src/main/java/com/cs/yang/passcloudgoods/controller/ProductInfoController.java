package com.cs.yang.passcloudgoods.controller;

import com.cs.yang.passcloudgoods.dao.ProductInfoDao;
import com.cs.yang.passcloudpojo.pojo.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductInfoController {
//商品详细
    @Autowired
    private ProductInfoDao productInfoDao;

    @RequestMapping("/SearchAll")
    public List<ProductInfo> findAll(){
        return productInfoDao.findAll();
    }


    @RequestMapping("/ScarchOne/{id}")
    public ProductInfo findOne(@PathVariable("id") int id){return  productInfoDao.findAllByProductId(id);};

}
