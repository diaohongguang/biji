package com.diao.mapper;

import com.diao.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Mapper
@Repository
public interface UserMapper {
    List<User> getAllUser();
    User getUserByUsername(@Param("username") String username);
    Set<String> getRoleByUsername(@Param("username") String username);
    int addUser(User user);
    int addUserRole(@Param("userId")int userId,@Param("roleId")int roleId);
    int getRoleIdByRoleName(@Param("roleName")String roleName);
    int updataPassword(@Param("userId")int userId,@Param("password")String password);
}
