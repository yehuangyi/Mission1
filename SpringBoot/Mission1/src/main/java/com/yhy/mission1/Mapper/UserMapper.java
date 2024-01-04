package com.yhy.mission1.Mapper;

import com.yhy.mission1.Entity.User;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    User findById(Integer id);
    //根据用户名查询用户
    @Select("select * from user  where  username=#{username}")
    User findByUsername(String username);
    //添加
    @Insert("insert  into  user(username,password)" + " values(#{username},#{password})")
    void add(String username, String password);

    @Select("select * from user")
    ArrayList<User> findAll();
    @Delete("delete from user where id=#{id}")
    void delete(Integer id);

    @Update("update user set username=#{username}, password=#{password},sex=#{sex}," +
            "age=#{age},email=#{email},phone=#{phone},role=#{role} where id=#{id}")
    void save(User user);
}
