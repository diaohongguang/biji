package com.diao.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto2 {
    private String articleTitle;
    private String articleInfo;
    private String targetId;
}
