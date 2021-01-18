package com.imooc.spring.service;

import com.imooc.spring.dao.UserDao;
import com.imooc.spring.entity.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserServiceImpl  implements UserService{
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void register(User user) {
        userDao.save(user);
    }
}
