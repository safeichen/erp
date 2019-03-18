package com.aqemachinery.erp.dal.dao;


import com.aqemachinery.erp.dal.entity.ContractProductEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(com.aqemachinery.erp.dal.entity.ContractProductEntity record);

    int insertSelective(com.aqemachinery.erp.dal.entity.ContractProductEntity record);

    com.aqemachinery.erp.dal.entity.ContractProductEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(com.aqemachinery.erp.dal.entity.ContractProductEntity record);

    int updateByPrimaryKey(com.aqemachinery.erp.dal.entity.ContractProductEntity record);
}