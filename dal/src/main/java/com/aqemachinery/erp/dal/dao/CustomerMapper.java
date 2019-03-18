package com.aqemachinery.erp.dal.dao;


import com.aqemachinery.erp.dal.entity.CustomerEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(com.aqemachinery.erp.dal.entity.CustomerEntity record);

    int insertSelective(com.aqemachinery.erp.dal.entity.CustomerEntity record);

    com.aqemachinery.erp.dal.entity.CustomerEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(com.aqemachinery.erp.dal.entity.CustomerEntity record);

    int updateByPrimaryKey(com.aqemachinery.erp.dal.entity.CustomerEntity record);
}