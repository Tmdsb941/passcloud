package com.cs.yang.passcloudeurekaribbon.service;

import com.cs.yang.passcloudpojo.pojo.ProductInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RestController
public class GoodsService {
    @Autowired
    RestTemplate restTemplate;

    //通过之前注入ioc容器的restTemplate来消费service-hi服务的“/hi”接口
    @HystrixCommand(fallbackMethod = "hiError")
    @GetMapping("/good")
    public List<ProductInfo> getAll(){
        ProductInfo[] productInfos=this.restTemplate.getForObject("http://CLOUD-GOODS:8890/product/SearchAll",ProductInfo[].class);
        List<ProductInfo> list=Arrays.asList(productInfos);
        return list;
    }

    public List<ProductInfo> hiError(){
        ProductInfo[] productInfos=this.restTemplate.getForObject("http://CLOUD-GOOD:8889/product/SearchAll",ProductInfo[].class);
        List<ProductInfo> list=Arrays.asList(productInfos);
        return list;
    }
}
