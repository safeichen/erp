package com.aqemachinery.erp.dal.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ContractProductEntity implements Serializable {
    private Long id;

    private Long contractId;

    private Long productId;

    private Integer productQuantity;

    private String productName;

    private String productEname;

    private String figureNo;

    private String pnNo;

    private BigDecimal salePrice;

    private BigDecimal settlementPrice;

    private String packingRequirement;

    private String remark;

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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductEname() {
        return productEname;
    }

    public void setProductEname(String productEname) {
        this.productEname = productEname == null ? null : productEname.trim();
    }

    public String getFigureNo() {
        return figureNo;
    }

    public void setFigureNo(String figureNo) {
        this.figureNo = figureNo == null ? null : figureNo.trim();
    }

    public String getPnNo() {
        return pnNo;
    }

    public void setPnNo(String pnNo) {
        this.pnNo = pnNo == null ? null : pnNo.trim();
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(BigDecimal settlementPrice) {
        this.settlementPrice = settlementPrice;
    }

    public String getPackingRequirement() {
        return packingRequirement;
    }

    public void setPackingRequirement(String packingRequirement) {
        this.packingRequirement = packingRequirement == null ? null : packingRequirement.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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