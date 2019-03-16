package com.aqemachinery.erp.dal.entitytest;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class ProductEnttiy {
    private Long id;
    private String productName;
    private String productEName;
    private String figureNo;
    private String pnNo;
    private BigDecimal salePrice;
    private String creator;
    private Timestamp createTime;
    private String modifyUser;
    private Timestamp modifyTime;
}
