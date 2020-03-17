package com.diao.service;


import com.diao.pojo.Article;
import com.diao.pojo.dto.ArticleDto;


import java.util.List;

public interface ArticleService {
    List<ArticleDto> getAllArticleByUserId(Integer id, int currentPage,int pageSize,String keywords);
    int delArticleByArticleId(int id);
    int getArticleCountByUserId(Integer id,String  keywords);
    int addArticle(Article article);
    Article getArticleByArticleId(Integer articleId);

}
