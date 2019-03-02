package com.cs.yang.passcloudorder.dao;

import com.cs.yang.passcloudpojo.pojo.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.temporal.TemporalAccessor;

public interface OrderMasterDao extends JpaRepository<OrderMaster, Integer> {
        void  deleteByOrderId(int id);
        OrderMaster findAllByOrderId(int id);
}
