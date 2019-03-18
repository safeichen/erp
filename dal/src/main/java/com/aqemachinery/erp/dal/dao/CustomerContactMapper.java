package com.aqemachinery.erp.dal.dao;


import com.aqemachinery.erp.dal.entity.CustomerContactEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerContactMapper {
    int deleteByPrimaryKey(Long id);

    int insert(com.aqemachinery.erp.dal.entity.CustomerContactEntity record);

    int insertSelective(com.aqemachinery.erp.dal.entity.CustomerContactEntity record);

    com.aqemachinery.erp.dal.entity.CustomerContactEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(com.aqemachinery.erp.dal.entity.CustomerContactEntity record);

    int updateByPrimaryKey(com.aqemachinery.erp.dal.entity.CustomerContactEntity record);
}