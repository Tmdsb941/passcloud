package com.cs.yang.passcloudgoods.controller;

import com.cs.yang.passcloudgoods.dao.ProductPicInfoDao;
import com.cs.yang.passcloudpojo.pojo.ProductPicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductPicInfoController {
//商品图片
    @Autowired
    private ProductPicInfoDao productPicInfoDao;



}
