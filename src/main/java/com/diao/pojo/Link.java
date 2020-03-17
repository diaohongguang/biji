package com.diao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Link {
    private String linkId;
    private String linkName;
    private String linkAddress;
    private String linkDescribe;
    private Date linkCreateTime;
}
