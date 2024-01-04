package com.yhy.mission1.Mapper;

import com.yhy.mission1.Entity.Order;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface OrderMapper {
    @Insert("insert  into  orders(user_id,good_id,generation_time,buy_number,total_money)" + " values(#{user_id},#{good_id},#{generation_time},#{buy_number},#{total_money})")
    void add(Order order);

    @Select("select * from orders where id=#{id}")
    Order findById(Integer id);

    @Delete("delete from orders where id=#{id}")
    void deleteById(Integer id);
    @Update("update orders set user_id=#{user_id},good_id=#{good_id},generation_time=#{generation_time},buy_number=#{buy_number},total_money=#{total_money} where id=#{id}")
    void save(Order order);

    @Select("select * from orders where user_id=#{userId}")
    ArrayList<Order> findByUserId(Integer userId);
}
