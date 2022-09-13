package com.mp.dsjr2022.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mp.dsjr2022.domain.User;
import com.mp.dsjr2022.service.UserService;
import com.mp.dsjr2022.dao.UserDao;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // @Autowired
    private UserDao userDao;

    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    public User findUserById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public Long saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public Long updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public Long deleteUser(Long id) {
        return userDao.deleteUser(id);
    }
}
