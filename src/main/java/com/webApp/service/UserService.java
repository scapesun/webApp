package com.webApp.service;

import com.webApp.dao.UserDao;
import com.webApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/28.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User login(String name, String password) {
        return userDao.getByNameAndPassword(name, password);
    }
}
