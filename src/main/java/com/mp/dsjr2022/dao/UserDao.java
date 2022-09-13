package com.mp.dsjr2022.dao;

import com.mp.dsjr2022.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAllUser();

    User findById(Long id);

    Long saveUser(User user);

    Long updateUser(User user);

    Long deleteUser(Long id);
}
