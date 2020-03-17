package com.diao.mapper;

import com.diao.pojo.Link;
import com.diao.pojo.dto.LinkDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LinkMapper {
    int addLink(LinkDto link);
    int addLinkUser(LinkDto link);
    List<Link> getLinkById(@Param("id")int id, @Param("currentPage")int currentPage,@Param("pageSize")int pageSize);
    int getLinkCountById(@Param("id") int id);
    int delLinkTableById(@Param("linkId")String linkId);
    int delLinkUserTableById(@Param("linkId")String linkId);
}
