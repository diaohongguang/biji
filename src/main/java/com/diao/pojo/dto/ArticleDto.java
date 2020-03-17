package com.diao.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto {
    private Integer articleId;
    private String articleTitle;
    private String articleInfo;
    private Date articleCreateTime;
    private Integer articleState;
    private String articleMDInfo;
}
