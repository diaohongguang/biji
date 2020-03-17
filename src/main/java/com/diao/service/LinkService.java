package com.diao.service;

import com.diao.pojo.Link;
import com.diao.pojo.dto.LinkDto;


import java.util.List;

public interface LinkService {
    int addLink(LinkDto link);
    List<Link> getLinkById(int id, int currentPage,int pageSize);
    int getLinkCountById(int id);
    int delLinkTableById(String linkId);
}
