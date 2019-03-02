package com.cs.yang.passcloudorder.service;


import com.cs.yang.passcloudpojo.pojo.OrderDetial;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderDetialService {

     List<OrderDetial> quanbu();
     OrderDetial dange(int id);
     String deleteid(int id);
}
