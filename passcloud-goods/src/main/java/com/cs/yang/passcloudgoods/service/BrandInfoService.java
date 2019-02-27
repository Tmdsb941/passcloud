package com.cs.yang.passcloudgoods.service;

import com.cs.yang.passcloudpojo.pojo.BrandInfo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BrandInfoService {
    public List<BrandInfo> BrandSearchlAll();
}
