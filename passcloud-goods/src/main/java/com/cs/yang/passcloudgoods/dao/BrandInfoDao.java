package com.cs.yang.passcloudgoods.dao;

import com.cs.yang.passcloudpojo.pojo.BrandInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BrandInfoDao extends JpaRepository<BrandInfo,Integer> {
}
