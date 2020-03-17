package com.diao.service.impl;

import com.diao.mapper.TargetMapper;
import com.diao.pojo.Target;
import com.diao.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TargetServiceImpl implements TargetService {
    @Autowired
    TargetMapper targetMapper;
    @Override
    public int addTarget(Target target,int userId) {
        targetMapper.addTarget(target);
        return targetMapper.addUserTarget(targetMapper.getTargetIdByTargetName(target.getTargetName()),userId);

    }

    @Override
    public List<Target> getAllTargets(int userId) {
        return targetMapper.getAllTargets(userId);
    }
}
