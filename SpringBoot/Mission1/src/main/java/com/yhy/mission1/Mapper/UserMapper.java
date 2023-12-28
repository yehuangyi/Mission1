package com.yhy.mission1.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    public User findById(Integer id);
    //根据用户名查询用户
    @Select("select * from user  where  username=#{username}")
    User findByUsername(String username);
     //添加
    @Insert("insert  into  user(username,password)"+"values(#{username),#{password}")
    void add(String username, String password);
}
