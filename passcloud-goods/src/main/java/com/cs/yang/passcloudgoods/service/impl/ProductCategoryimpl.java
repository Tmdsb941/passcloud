package com.cs.yang.passcloudgoods.service.impl;

import com.cs.yang.passcloudgoods.dao.ProductCategoryDao;
import com.cs.yang.passcloudgoods.service.ProductCategoryService;
import com.cs.yang.passcloudpojo.pojo.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductCategoryimpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryDao productCategoryDao;
    @Override
    public List<ProductCategory> SearchAll() {
        return productCategoryDao.chaxun();
    }
}
