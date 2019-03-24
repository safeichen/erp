package com.aqemachinery.erp.service.dto;

import lombok.Data;
import org.joda.time.DateTime;

@Data
public class ContractDTO {
    private Long id;
    private String customerNo;
    private String customerName;
    private String customerNickname;
    private Integer tradeCountry;
    private String customerAddress;
    private String homepage;
    private String creator;
    private DateTime createTime;
    private String modifyUser;
    private DateTime modifyTime;
}
