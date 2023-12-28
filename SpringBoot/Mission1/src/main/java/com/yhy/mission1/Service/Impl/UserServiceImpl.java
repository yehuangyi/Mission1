package com.yhy.mission1.Service.Impl;

import com.yhy.mission1.Entity.User;
import com.yhy.mission1.Mapper.UserMapper;
import com.yhy.mission1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
}
