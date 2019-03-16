package com.aqemachinery.erp.dal.entitytest;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class ContractProductEntity {
    private Long id;
    private Long contractId;
    private Long productId;
    private Integer productQuantity;
    private String productName;
    private String productEName;
    private String figureNo;
    private String pnNo;
    private BigDecimal salePrice;
    private BigDecimal settlementPrice;
    private String packingRequirement;
    private String remark;
    private String creator;
    private Timestamp createTime;
    private String modifyUser;
    private Timestamp modifyTime;
}
