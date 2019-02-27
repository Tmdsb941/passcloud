package com.cs.yang.passcloudgoods.dao;

import com.cs.yang.passcloudpojo.pojo.ProductInfo;
import com.cs.yang.passcloudpojo.pojo.ProductPicInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductInfoDao extends JpaRepository<ProductInfo,Integer> {
//    ProductInfo findAllById(int id);

    ProductInfo findAllByProductId(@Param("ProductId")Integer ProductId);


}
