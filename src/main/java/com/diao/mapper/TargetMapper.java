package com.diao.mapper;

import com.diao.pojo.Target;
import com.diao.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TargetMapper {
    int addTarget(Target target);
    List<Target> getAllTargets(@Param("userId") int userId);
    Integer getTargetIdByTargetName(@Param("targetName") String targetName);
    int addUserTarget(@Param("targetId") int targetId,@Param("userId")int userId);
}
