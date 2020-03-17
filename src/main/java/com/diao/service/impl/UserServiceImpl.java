package com.diao.service.impl;

import com.diao.mapper.UserMapper;
import com.diao.pojo.User;
import com.diao.service.UserService;
import com.diao.untils.Md5Utils;
import com.diao.untils.UserUtil;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }

    @Override
    public Set<String> getRoleByUsername(String username) {
        return userMapper.getRoleByUsername(username);
    }

    @Override
    public int addUser(User user) {
        if (userMapper.getUserByUsername(user.getUsername())==null){
            user.setPassword(Md5Utils.getMd5Password(user.getPassword(), user.getUsername()));
            int boss = userMapper.getRoleIdByRoleName("boss");
            userMapper.addUser(user);
            user=userMapper.getUserByUsername(user.getUsername());
            return userMapper.addUserRole(user.getId(),boss);
        }
       else {
           return 0;
        }

    }

    @Override
    public int updataPassword(int userId, String password) {
        User user = UserUtil.getUser();
        password= Md5Utils.getMd5Password(password, user.getUsername());
        return userMapper.updataPassword(userId,password);
    }

}
