package com.aqemachinery.erp.dal.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ContractScheduleEntity implements Serializable {
    private Long id;

    private Long contractId;

    private BigDecimal reveivedDeposit;

    private Date depositDate;

    private BigDecimal reveivedBalance;

    private Date balanceDate;

    private Date expectedShipmentDate;

    private Date actualShipmentDate;

    private Date expectedArrivalDate;

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

    private Date billingDate;

    private BigDecimal billingAmount;

    private String creator;

    private Date createTime;

    private String modifyUser;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public BigDecimal getReveivedDeposit() {
        return reveivedDeposit;
    }

    public void setReveivedDeposit(BigDecimal reveivedDeposit) {
        this.reveivedDeposit = reveivedDeposit;
    }

    public Date getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(Date depositDate) {
        this.depositDate = depositDate;
    }

    public BigDecimal getReveivedBalance() {
        return reveivedBalance;
    }

    public void setReveivedBalance(BigDecimal reveivedBalance) {
        this.reveivedBalance = reveivedBalance;
    }

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    public Date getExpectedShipmentDate() {
        return expectedShipmentDate;
    }

    public void setExpectedShipmentDate(Date expectedShipmentDate) {
        this.expectedShipmentDate = expectedShipmentDate;
    }

    public Date getActualShipmentDate() {
        return actualShipmentDate;
    }

    public void setActualShipmentDate(Date actualShipmentDate) {
        this.actualShipmentDate = actualShipmentDate;
    }

    public Date getExpectedArrivalDate() {
        return expectedArrivalDate;
    }

    public void setExpectedArrivalDate(Date expectedArrivalDate) {
        this.expectedArrivalDate = expectedArrivalDate;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee == null ? null : payee.trim();
    }

    public String getNotifier() {
        return notifier;
    }

    public void setNotifier(String notifier) {
        this.notifier = notifier == null ? null : notifier.trim();
    }

    public String getDocumentRequirement() {
        return documentRequirement;
    }

    public void setDocumentRequirement(String documentRequirement) {
        this.documentRequirement = documentRequirement == null ? null : documentRequirement.trim();
    }

    public String getSpecialRequirement() {
        return specialRequirement;
    }

    public void setSpecialRequirement(String specialRequirement) {
        this.specialRequirement = specialRequirement == null ? null : specialRequirement.trim();
    }

    public String getPositiveMark() {
        return positiveMark;
    }

    public void setPositiveMark(String positiveMark) {
        this.positiveMark = positiveMark == null ? null : positiveMark.trim();
    }

    public String getThirdPartyTesting() {
        return thirdPartyTesting;
    }

    public void setThirdPartyTesting(String thirdPartyTesting) {
        this.thirdPartyTesting = thirdPartyTesting == null ? null : thirdPartyTesting.trim();
    }

    public BigDecimal getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(BigDecimal grossProfit) {
        this.grossProfit = grossProfit;
    }

    public BigDecimal getGrossMargin() {
        return grossMargin;
    }

    public void setGrossMargin(BigDecimal grossMargin) {
        this.grossMargin = grossMargin;
    }

    public String getShipmentPort() {
        return shipmentPort;
    }

    public void setShipmentPort(String shipmentPort) {
        this.shipmentPort = shipmentPort == null ? null : shipmentPort.trim();
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort == null ? null : destinationPort.trim();
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public BigDecimal getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(BigDecimal billingAmount) {
        this.billingAmount = billingAmount;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}