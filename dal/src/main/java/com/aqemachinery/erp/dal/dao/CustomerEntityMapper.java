package com.aqemachinery.erp.dal.dao;

import entity.CustomerEntity;

public interface CustomerEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CustomerEntity record);

    int insertSelective(CustomerEntity record);

    CustomerEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomerEntity record);

    int updateByPrimaryKey(CustomerEntity record);
}