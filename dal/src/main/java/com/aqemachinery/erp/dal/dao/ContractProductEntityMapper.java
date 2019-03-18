package com.aqemachinery.erp.dal.dao;

import entity.ContractProductEntity;

public interface ContractProductEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ContractProductEntity record);

    int insertSelective(ContractProductEntity record);

    ContractProductEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContractProductEntity record);

    int updateByPrimaryKey(ContractProductEntity record);
}