package com.diao.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkDto {
    private Integer userId;
    private String linkId;
    private String linkName;
    private String linkAddress;
    private String linkDescribe;
    private Date linkCreateTime;
}
