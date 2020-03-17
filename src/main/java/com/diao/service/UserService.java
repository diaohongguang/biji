package com.diao.service;

import com.diao.pojo.User;

import java.util.List;
import java.util.Set;


public interface UserService {
    List<User> getAllUser();
    User getUserByUsername(String username);
    Set<String> getRoleByUsername( String username);
    int addUser(User user);
    int updataPassword(int userId,String password);
}
