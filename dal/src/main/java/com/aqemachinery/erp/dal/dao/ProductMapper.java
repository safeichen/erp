package com.aqemachinery.erp.dal.dao;


import com.aqemachinery.erp.dal.entity.ProductEntity;

public interface ProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(com.aqemachinery.erp.dal.entity.ProductEntity record);

    int insertSelective(com.aqemachinery.erp.dal.entity.ProductEntity record);

    com.aqemachinery.erp.dal.entity.ProductEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(com.aqemachinery.erp.dal.entity.ProductEntity record);

    int updateByPrimaryKey(com.aqemachinery.erp.dal.entity.ProductEntity record);
}