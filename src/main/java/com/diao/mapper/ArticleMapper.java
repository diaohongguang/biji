package com.diao.mapper;

import com.diao.pojo.Article;
import com.diao.pojo.dto.ArticleDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface ArticleMapper {
    List<ArticleDto> getAllArticleByUserId(@Param("id")Integer id, @Param("currentPage")int currentPage
            ,@Param("pageSize")int pageSize,@Param("keywords")String keywords);
    int getArticleCountByUserId(@Param("id")Integer id,@Param("keywords")String keywords);
    int delUserArticleByArticleId(@Param("id")int id);
    int addArticle(Article article);
    Article getArticleByArticleId(@Param("articleId")int id);
    int updataArticle(Article article);
}
