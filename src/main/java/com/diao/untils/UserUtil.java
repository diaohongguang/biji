package com.diao.untils;

import com.diao.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;


public class UserUtil {
    public static User getUser(){
        Session session = SecurityUtils.getSubject().getSession();
        User user = (User) session.getAttribute("user");
        return user ;
    }
}
