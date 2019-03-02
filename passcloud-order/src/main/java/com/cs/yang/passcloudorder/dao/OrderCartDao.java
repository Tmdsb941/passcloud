package com.cs.yang.passcloudorder.dao;

import com.cs.yang.passcloudpojo.pojo.OrderCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderCartDao extends JpaRepository<OrderCart,Integer> {

    void   deleteByCartId(int id);
    OrderCart findAllByCartId(int csid);
}
