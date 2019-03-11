package com.aqemachinery.erp.dal.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class CustomerEntity {
    private Long id;
    private String customerNo;
    private String customerName;
    private String customerNickname;
    private Integer tradeCountry;
    private String customerAdress;
    private String homePage;
    private String creator;
    private Timestamp createTime;
    private String modifyUser;
    private Timestamp modifyTime;
}
