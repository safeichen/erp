package com.aqemachinery.erp.dal.entitytest;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ContractEntity {
    private Long id;
    private String contractNo;
    private Timestamp contractDate;
    private Long customerId;
    private Integer priceClause;
    private Integer settlementMethod;
    private String creator;
    private Timestamp createTime;
    private String modifyUser;
    private Timestamp modifyTime;
}
