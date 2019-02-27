package com.cs.yang.passcloudgoods.service;


import com.cs.yang.passcloudpojo.pojo.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductCategoryService {
    public List<ProductCategory> SearchAll();
}
