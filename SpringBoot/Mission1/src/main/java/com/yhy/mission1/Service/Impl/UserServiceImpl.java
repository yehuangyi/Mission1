package com.yhy.mission1.Service.Impl;

import com.yhy.mission1.Entity.User;
import com.yhy.mission1.Mapper.UserMapper;
import com.yhy.mission1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByUsername(String username) {
         User u= userMapper.findByUsername(username);
        return u;
    }

    @Override
    public void register(String username, String password) {
         //加密

        //添加
        userMapper.add(username,password);

    }

    @Override
    public ArrayList<User> findALl() {
        ArrayList<User> users = userMapper.findAll();
        return users;
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.delete(id);
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }
}
