package com.cs.yang.passcloudorder.service;

import com.cs.yang.passcloudpojo.pojo.OrderMaster;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderMasterService {

    String MasterAdd(OrderMaster master);
    String MasterDel(int id);
    List<OrderMaster> MasterAll();
    OrderMaster MasterAllById(int id);
}
