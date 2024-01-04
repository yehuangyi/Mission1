package com.yhy.mission1.Service;

import com.yhy.mission1.Entity.User;

import java.util.ArrayList;

public interface UserService {
    public User findById(Integer id);
    //根据用户名查询用户
    User findByUsername(String username);
    //注册
    void register(String username, String password);

    ArrayList<User> findALl();

    void deleteById(Integer id);

    void save(User user);
}
