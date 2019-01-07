package com.reformer.wt_census.service.impl;

import com.reformer.wt_census.dao.*;
import com.reformer.wt_census.model.*;
import com.reformer.wt_census.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired(required = false)
    private IUserDao userDao;

    @Override
    public void addUsers(User user) throws Exception {
        userDao.addUsers(user);
    }

    @Override
    public List<User> userList() throws Exception {
        return userDao.userList();
    }
}
