package com.cs.yang.passcloudgoods.controller;

import com.cs.yang.passcloudgoods.dao.BrandInfoDao;
import com.cs.yang.passcloudpojo.pojo.BrandInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/BrandInfo")
@RestController
public class BrandInfoController {

    @Autowired
    private BrandInfoDao brandInfoDao;

    @RequestMapping("/SarchAll")
    public List<BrandInfo> chaxun(){
        return brandInfoDao.findAll();
    }

}
