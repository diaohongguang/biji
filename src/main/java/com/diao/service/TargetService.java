package com.diao.service;

import com.diao.pojo.Target;


import java.util.List;

public interface TargetService {
    int addTarget(Target target,int userId);
    List<Target> getAllTargets(int userId);

}
