package com.reformer.wt_census.service;

import com.reformer.wt_census.model.*;

import java.util.List;
import java.util.Map;

public interface IUserService {
    ////增加数据到数据库
    public void addUsers(User user)throws Exception;

    //查询记录
    public List<User> userList()throws Exception;



}
