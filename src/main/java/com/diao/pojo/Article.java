package com.diao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private Integer articleId;
    private String articleTitle;
    private String articleInfo;
    private Date articleCreateTime;
    private Integer articleState;
    private Integer userId;
    private Integer targetId;
    private String articleMDInfo;
}
