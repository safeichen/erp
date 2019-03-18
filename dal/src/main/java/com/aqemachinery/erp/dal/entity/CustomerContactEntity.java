package com.aqemachinery.erp.dal.entity;

import java.io.Serializable;
import java.util.Date;

public class CustomerContactEntity implements Serializable {
    private Long id;

    private Long customerId;

    private String comtactName;

    private String contactDepartment;

    private String contactGender;

    private String contactTitle;

    private String contactTelephone;

    private String contactMobilephone;

    private String contactFax;

    private String contactEmail;

    private String contactReserveEmail;

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

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getComtactName() {
        return comtactName;
    }

    public void setComtactName(String comtactName) {
        this.comtactName = comtactName == null ? null : comtactName.trim();
    }

    public String getContactDepartment() {
        return contactDepartment;
    }

    public void setContactDepartment(String contactDepartment) {
        this.contactDepartment = contactDepartment == null ? null : contactDepartment.trim();
    }

    public String getContactGender() {
        return contactGender;
    }

    public void setContactGender(String contactGender) {
        this.contactGender = contactGender == null ? null : contactGender.trim();
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle == null ? null : contactTitle.trim();
    }

    public String getContactTelephone() {
        return contactTelephone;
    }

    public void setContactTelephone(String contactTelephone) {
        this.contactTelephone = contactTelephone == null ? null : contactTelephone.trim();
    }

    public String getContactMobilephone() {
        return contactMobilephone;
    }

    public void setContactMobilephone(String contactMobilephone) {
        this.contactMobilephone = contactMobilephone == null ? null : contactMobilephone.trim();
    }

    public String getContactFax() {
        return contactFax;
    }

    public void setContactFax(String contactFax) {
        this.contactFax = contactFax == null ? null : contactFax.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public String getContactReserveEmail() {
        return contactReserveEmail;
    }

    public void setContactReserveEmail(String contactReserveEmail) {
        this.contactReserveEmail = contactReserveEmail == null ? null : contactReserveEmail.trim();
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