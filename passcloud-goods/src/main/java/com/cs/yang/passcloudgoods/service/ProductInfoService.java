package com.cs.yang.passcloudgoods.service;

import com.cs.yang.passcloudpojo.pojo.ProductInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductInfoService {
    public List<ProductInfo>  SearchAll();
    public ProductInfo SearchAllById(int id);
}
