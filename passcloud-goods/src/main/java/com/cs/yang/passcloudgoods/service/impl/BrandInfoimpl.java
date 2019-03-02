package com.cs.yang.passcloudgoods.service.impl;

import com.cs.yang.passcloudgoods.dao.BrandInfoDao;
import com.cs.yang.passcloudgoods.service.BrandInfoService;
import com.cs.yang.passcloudpojo.pojo.BrandInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/cs")
public class BrandInfoimpl  implements BrandInfoService {

    @Autowired
    private BrandInfoDao brandInfoDao;

    @RequestMapping("/CSCS")
    public List<BrandInfo> BrandSearchlAll() {
        return brandInfoDao.findAll();
    }
}
