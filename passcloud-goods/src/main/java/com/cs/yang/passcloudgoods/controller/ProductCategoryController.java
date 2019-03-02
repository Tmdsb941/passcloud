package com.cs.yang.passcloudgoods.controller;


import com.cs.yang.passcloudgoods.dao.ProductCategoryDao;
import com.cs.yang.passcloudpojo.pojo.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productcategory")
public class ProductCategoryController  {
//商品分类
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @RequestMapping("/SearchAll")
    public List<ProductCategory> SearchAll(){

        return  productCategoryDao.findAll();

    }
    @RequestMapping("/SearchAl")
    public  List<ProductCategory> chaxun(){
        return productCategoryDao.chaxun();
    }
}
