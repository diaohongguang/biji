package com.diao;


import com.diao.mapper.ArticleMapper;
import com.diao.mapper.TargetMapper;
import com.diao.pojo.Target;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;



@SpringBootTest
class SpringbootVueApplicationTests {

    @Autowired
    ArticleMapper articleMapper;
    @Test
    void contextLoads() throws JsonProcessingException {

        System.out.println(articleMapper.getArticleByArticleId(8));

    }

}
