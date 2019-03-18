package com.aqemachinery.erp.dal.dao;

import entity.ProductEntity;

public interface ProductEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductEntity record);

    int insertSelective(ProductEntity record);

    ProductEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductEntity record);

    int updateByPrimaryKey(ProductEntity record);
}