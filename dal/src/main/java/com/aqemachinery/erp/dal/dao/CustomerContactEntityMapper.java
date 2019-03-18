package com.aqemachinery.erp.dal.dao;

import entity.CustomerContactEntity;

public interface CustomerContactEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CustomerContactEntity record);

    int insertSelective(CustomerContactEntity record);

    CustomerContactEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomerContactEntity record);

    int updateByPrimaryKey(CustomerContactEntity record);
}