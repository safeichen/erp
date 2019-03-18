package com.aqemachinery.erp.dal.entity;

import java.io.Serializable;
import java.util.Date;

public class ContractEntity implements Serializable {
    private Long id;

    private String contractNo;

    private Date contractDate;

    private Long customerId;

    private Integer priceClause;

    private Integer settlementMethod;

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

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Integer getPriceClause() {
        return priceClause;
    }

    public void setPriceClause(Integer priceClause) {
        this.priceClause = priceClause;
    }

    public Integer getSettlementMethod() {
        return settlementMethod;
    }

    public void setSettlementMethod(Integer settlementMethod) {
        this.settlementMethod = settlementMethod;
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