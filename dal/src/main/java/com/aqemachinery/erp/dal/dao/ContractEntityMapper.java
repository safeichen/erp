package com.aqemachinery.erp.dal.dao;

import entity.ContractEntity;

public interface ContractEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ContractEntity record);

    int insertSelective(ContractEntity record);

    ContractEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContractEntity record);

    int updateByPrimaryKey(ContractEntity record);
}