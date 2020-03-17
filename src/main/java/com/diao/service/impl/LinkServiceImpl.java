package com.diao.service.impl;

import com.diao.mapper.LinkMapper;
import com.diao.pojo.Link;
import com.diao.pojo.dto.LinkDto;
import com.diao.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class LinkServiceImpl implements LinkService {
    @Autowired
    LinkMapper linkMapper;
    @Override
    public int addLink(LinkDto link) {
        link.setLinkId(UUID.randomUUID().toString());
        link.setLinkCreateTime(new Date());
        linkMapper.addLinkUser(link);
        return linkMapper.addLink(link);
    }

    @Override
    public List<Link> getLinkById(int id, int currentPage,int pageSize) {
        currentPage=(currentPage-1)*pageSize;
        return linkMapper.getLinkById(id,currentPage,pageSize);
    }

    @Override
    public int getLinkCountById(int id) {
        return linkMapper.getLinkCountById(id);
    }

    @Override
    public int delLinkTableById(String linkId) {
        linkMapper.delLinkTableById(linkId);
        return linkMapper.delLinkUserTableById(linkId);

    }
}
