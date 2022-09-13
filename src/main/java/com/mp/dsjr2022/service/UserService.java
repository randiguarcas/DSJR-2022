package com.mp.dsjr2022.service;

import com.mp.dsjr2022.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();

    User findUserById(Long id);

    Long saveUser(User user);

    Long updateUser(User user);

    Long deleteUser(Long id);
}
