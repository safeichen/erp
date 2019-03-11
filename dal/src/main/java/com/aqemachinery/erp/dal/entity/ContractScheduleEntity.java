package com.aqemachinery.erp.dal.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class ContractScheduleEntity {
    private Long id;
    private Long contractId;
    private BigDecimal reveivedDeposit;
    private Timestamp depositDate;
    private BigDecimal reveivedBalance;
    private Timestamp balanceDate;
    private Timestamp expectedShipmentDate;
    private Timestamp actualShipmentDate;
    private Timestamp expectedArrivalDate;
    private String consignee;
    private String payee;
    private String notifier;
    private String documentRequirement;
    private String specialRequirement;
    private String positiveMark;
    private String thirdPartyTesting;
    private BigDecimal grossProfit;
    private BigDecimal grossMargin;
    private String shipmentPort;
    private String destinationPort;
    private Timestamp billingDate;
    private BigDecimal billingAmount;
    private String creator;
    private Timestamp createTime;
    private String modifyUser;
    private Timestamp modifyTime;
}
