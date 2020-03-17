package com.diao.service.impl;

import com.diao.mapper.ArticleMapper;
import com.diao.pojo.Article;
import com.diao.pojo.dto.ArticleDto;
import com.diao.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    public List<ArticleDto> getAllArticleByUserId(Integer id, int currentPage,int pageSize,String keywords) {
        List<ArticleDto> list=new ArrayList<>();
        currentPage=(currentPage-1)*pageSize;
        for (ArticleDto article:articleMapper.getAllArticleByUserId(id,currentPage,pageSize,keywords)){
            if(article.getArticleMDInfo().length()>10)
            {
            article.setArticleMDInfo(article.getArticleMDInfo().substring(0,10));}
            list.add(article);
        }
        return list;
    }

    @Override
    public int delArticleByArticleId(int id) {
        return articleMapper.delUserArticleByArticleId(id);
    }

    public int getArticleCountByUserId(Integer id,String  keywords) {
        return articleMapper.getArticleCountByUserId(id,keywords);
    }

    @Override
    public int addArticle(Article article) {
        return articleMapper.addArticle(article);
    }

    @Override
    public Article getArticleByArticleId(Integer articleId) {
        return articleMapper.getArticleByArticleId(articleId);
    }


    public int updataArticle(Article article) {
        return articleMapper.updataArticle(article);
    }
}
