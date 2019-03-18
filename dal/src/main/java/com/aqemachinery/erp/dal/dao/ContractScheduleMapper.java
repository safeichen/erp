package com.aqemachinery.erp.dal.dao;


import com.aqemachinery.erp.dal.entity.ContractScheduleEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractScheduleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(com.aqemachinery.erp.dal.entity.ContractScheduleEntity record);

    int insertSelective(com.aqemachinery.erp.dal.entity.ContractScheduleEntity record);

    com.aqemachinery.erp.dal.entity.ContractScheduleEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(com.aqemachinery.erp.dal.entity.ContractScheduleEntity record);

    int updateByPrimaryKey(com.aqemachinery.erp.dal.entity.ContractScheduleEntity record);
}