package com.cs.yang.passcloudgoods.service.impl;

import com.cs.yang.passcloudgoods.dao.ProductInfoDao;
import com.cs.yang.passcloudgoods.service.ProductInfoService;
import com.cs.yang.passcloudpojo.pojo.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ProductInfoimpl implements ProductInfoService {
    @Autowired
    private ProductInfoDao productInfoDao;

    @Override
    public List<ProductInfo> SearchAll() {
        return productInfoDao.findAll();
    }
    @Override
    public ProductInfo SearchAllById(@PathVariable("id") int id) {
        return productInfoDao.findAllByProductId(id);
    }
}
