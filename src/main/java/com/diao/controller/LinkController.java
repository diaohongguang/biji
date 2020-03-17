package com.diao.controller;

import com.diao.pojo.Link;
import com.diao.pojo.User;
import com.diao.pojo.dto.LinkDto;
import com.diao.service.impl.LinkServiceImpl;
import com.diao.untils.Page;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class LinkController {
    @Autowired
    LinkServiceImpl linkService;
    @Autowired
    ObjectMapper objectMapper;

    @GetMapping("/link/{currentPage}/{totle}")
    public Map<String, Object> fristGetLink(@PathVariable("currentPage") int currentPage, @PathVariable("totle") int totle) {
        User user = getUser();
        Map<String, Object> map = new HashMap<>();
        if (currentPage>=1){
            List<Link> list = linkService.getLinkById(user.getId(), currentPage, totle);
            if (list.size() == 0 && currentPage > 1) {
                map.put("linkData", linkService.getLinkById(user.getId(), currentPage - 1, totle));
            }else {
                map.put("linkData", list);
            }
        }


        return map;
    }

    @GetMapping("/linkcount/{currentPage}/{totle}")
    public Map<String, Object> getCountLink(@PathVariable("currentPage") int currentPage, @PathVariable("totle") int totle) {
        User user = getUser();
        Map<String, Object> map = fristGetLink(currentPage,totle);
        int count = linkService.getLinkCountById(user.getId());
        map.put("totle",count);
        System.out.println(map);
       return map;
    }

    @PostMapping("/link/add")
    public Boolean addLink(@RequestBody LinkDto linkDto) {
        System.out.println(linkDto);
        linkDto.setUserId(getUser().getId());
        if (linkService.addLink(linkDto) == 1) {
            return true;
        } else {
            return false;
        }
    }

    @GetMapping("/link/del")
    public Boolean delLink(@RequestParam("linkId") String linkId) {
        linkService.delLinkTableById(linkId);
        return true;
    }



    public User getUser() {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        User user = (User) session.getAttribute("user");
        return user;
    }
}
