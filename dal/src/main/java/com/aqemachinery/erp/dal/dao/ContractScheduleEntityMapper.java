package com.aqemachinery.erp.dal.dao;

import entity.ContractScheduleEntity;

public interface ContractScheduleEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ContractScheduleEntity record);

    int insertSelective(ContractScheduleEntity record);

    ContractScheduleEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContractScheduleEntity record);

    int updateByPrimaryKey(ContractScheduleEntity record);
}