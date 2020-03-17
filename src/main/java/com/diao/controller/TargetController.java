package com.diao.controller;

import com.diao.pojo.Target;
import com.diao.pojo.User;
import com.diao.service.impl.TargetServiceImpl;
import com.diao.untils.State;
import com.diao.untils.UserUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class TargetController {
    @Autowired
    TargetServiceImpl targetService;
    @Autowired
    ObjectMapper objectMapper;
    @GetMapping("/user/addtarget/{targetName}")
    public State addTarget(@PathVariable("targetName")String targetName)
    {
        User user = UserUtil.getUser();
        Target target = new Target();
        target.setTargetCreateTime(new Date());
        target.setTargetName(targetName);
        if (targetService.addTarget(target,user.getId())==1){
            return new State(1,"增加成功");
        }else {
            return new State(0,"增加shib");
        }

    }
    @PostMapping("/user/target")
    public List<Target> getAllTargets(){
        User user = UserUtil.getUser();
        List<Target> allTargets = targetService.getAllTargets(user.getId());
        return allTargets;
    }

}
