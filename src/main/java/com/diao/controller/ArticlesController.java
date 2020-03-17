package com.diao.controller;
import com.diao.pojo.Article;
import com.diao.pojo.User;
import com.diao.pojo.dto.ArticleDto;

import com.diao.service.impl.ArticleServiceImpl;
import com.diao.untils.Page;
import com.diao.untils.State;
import com.diao.untils.TengXunUpload;
import com.diao.untils.UserUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@RequestMapping("/user")
@RestController
public class ArticlesController {
    @Autowired
    private ArticleServiceImpl articleService;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private TengXunUpload tengXunUpload;


    @GetMapping({"/articles/{currentPage}/{pageSize}/{keywords}","/articles/{currentPage}/{pageSize}"})
    public Map<String,Object> getAllArticles(@PathVariable("currentPage")Integer current,@PathVariable("pageSize")Integer pageSize,@PathVariable(name = "keywords" ,required = false) String keywords){
        //用来保存 列表 和 数据总数的
        System.out.println(current);
        System.out.println("this is keywords"+keywords);
        System.out.println(keywords==null);
        Map<String,Object> map=new HashMap<>();
        User user = UserUtil.getUser();
        if (articleService.getAllArticleByUserId(user.getId(),current,pageSize,keywords).size()==0&&current>1){
            map.put("tableData",articleService.getAllArticleByUserId(user.getId(),current-1,pageSize,keywords));
        }
        //放入数据
        else {
            map.put("tableData",articleService.getAllArticleByUserId(user.getId(),current,pageSize,keywords));
        }
        map.put("total",articleService.getArticleCountByUserId(user.getId(),keywords));
        return map;
    }
    @GetMapping("/article/del/{articleId}")
    public State delArticle(@PathVariable("articleId") int articleId){
        System.out.println(articleId);
        int i = articleService.delArticleByArticleId(articleId);
        if (i==1)
        {
            return new State(1,"删除成功");
        }
        return new State(0,"删除失败");
    }


    @PostMapping("/article/photo")
    public State downPhoto(@RequestParam("image") MultipartFile file ,HttpServletRequest request) throws IOException {
        String s = tengXunUpload.uploadFile(file.getOriginalFilename(), file.getInputStream(), file.getContentType());
           s="https://diaoupload-1301333092.cos.ap-shanghai.myqcloud.com/image/"+s;
        return new State(1,s);
    }
    @PostMapping("/addarticle")
    public State addArticle(@RequestBody Article article)
    {
        User user = UserUtil.getUser();
        article.setArticleCreateTime(new Date());
        article.setArticleState(0);
        article.setUserId(user.getId());
        if (articleService.addArticle(article)==1)
        {
            return new State(1,"添加成功");
        }
        else {
            return new State(0,"添加失败");
        }

    }
    @PostMapping("/getarticle/{articleId}")
    public Article getArticle(@PathVariable("articleId")Integer articleId){
        System.out.println("==>这是文章的id"+articleId);
        return articleService.getArticleByArticleId(articleId);
    }
    @GetMapping("/updataArticle/{articleId}")
    public Map<String,Object> updataArticle(@PathVariable("articleId")Integer articleId){
        Article article = articleService.getArticleByArticleId(articleId);
        Map<String,Object> map=new HashMap<>();
        map.put("articleTitle",article.getArticleTitle());
        map.put("articleMDInfo",article.getArticleMDInfo());
        return map;
    }
    @PostMapping("/updataArticle")
    public State updArticle(@RequestBody Article article)
    {
        System.out.println(article);
        article.setArticleCreateTime(new Date());
        if (articleService.updataArticle(article)==1){
            return new State(1,"修改成功!");
        }else {
            return new State(0,"修改失败");
        }
    }
}
