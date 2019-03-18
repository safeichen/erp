package com.aqemachinery.erp.dal.dao;


import com.aqemachinery.erp.dal.entity.ContractEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractMapper {
    int deleteByPrimaryKey(Long id);

    int insert(com.aqemachinery.erp.dal.entity.ContractEntity record);

    int insertSelective(com.aqemachinery.erp.dal.entity.ContractEntity record);

    com.aqemachinery.erp.dal.entity.ContractEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(com.aqemachinery.erp.dal.entity.ContractEntity record);

    int updateByPrimaryKey(com.aqemachinery.erp.dal.entity.ContractEntity record);
}