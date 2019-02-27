package com.cs.yang.passcloudorder.dao;

import com.cs.yang.passcloudpojo.pojo.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterDao extends JpaRepository<OrderMaster, Integer> {
}
