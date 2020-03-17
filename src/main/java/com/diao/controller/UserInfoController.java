package com.diao.controller;

import com.diao.pojo.User;
import com.diao.pojo.dto.UserDto;
import com.diao.service.impl.UserServiceImpl;
import com.diao.untils.Md5Utils;
import com.diao.untils.State;
import com.diao.untils.UserUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RequestMapping("/user")
@RestController
public class UserInfoController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping({"/","/index"})
    public String goIndex(){
        return "index";
    }

    @GetMapping("/logout")
    public State logout(){
        SecurityUtils.getSubject().logout();
        return new State(1,"");
    }
    @GetMapping("/all")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping("/login")
    public State getLoginInfo(@RequestBody UserDto user) {
        Subject subject = SecurityUtils.getSubject();
        State state = new State();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        try {
            subject.login(token);
            state.setState(1);
            state.setMsg("登陆成功");
            subject.getSession().setAttribute("user", userService.getUserByUsername(user.getUsername()));
            return state;
        } catch (Exception e) {
            state.setState(0);
            state.setMsg("账号或密码错误!");
            return state;
        }


    }
    @PostMapping("/role")
    public State getRole(){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        User user = (User) session.getAttribute("user");
        System.out.println(user);
        boolean boss = subject.hasRole("boss");
        State state = new State();
        System.out.println(boss);
        if (boss){
            state.setState(1);
            state.setMsg(user.getUsername());
            return state;
        }
        else{
            state.setState(0);
            state.setMsg("无权限");
            return state;
        }


    }
    @PostMapping("/reg")
    public State regUser(@RequestBody User user){
      if (userService.addUser(user)==1)
      {
          return new State(1,"注册成功");
      }
      else
      {
          return new State(0,"注册失败");
      }

    }
    @PostMapping("/changepwd")
    public State changePassword(@RequestBody Map map)
    {
        String password = (String) map.get("password");
        String newPassword = (String) map.get("newPassword");

        User user = UserUtil.getUser();
        password = Md5Utils.getMd5Password(password, user.getUsername());
        if (password.equals(user.getPassword())){
            userService.updataPassword(user.getId(),newPassword);
            return new State(1,"修改密码成功");
        }
        else
        {
            return new State(0,"修改密码失败");
        }
    }
}
