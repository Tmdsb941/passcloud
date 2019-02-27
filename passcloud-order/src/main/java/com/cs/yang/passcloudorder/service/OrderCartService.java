package com.cs.yang.passcloudorder.service;

import com.cs.yang.passcloudpojo.pojo.OrderCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderCartService  {
    public String DropCart(int id);
    public List<OrderCart> SearchAll();
    public String AddCart(OrderCart cart);
    public OrderCart SearchCartOne(int id);
}
