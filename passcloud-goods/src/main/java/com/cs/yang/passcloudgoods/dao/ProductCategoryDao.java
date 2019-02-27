package com.cs.yang.passcloudgoods.dao;

import com.cs.yang.passcloudpojo.pojo.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer> {

    @Query("from ProductCategory   where  categoryLevel=2")
    List<ProductCategory> chaxun();

}
