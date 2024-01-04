package com.yhy.mission1.Mapper;

import com.yhy.mission1.Entity.Good;
import org.apache.ibatis.annotations.*;

@Mapper
public interface GoodMapper {
    @Insert("insert  into  good(goodname,price,pricture,number,remain,goodstate)" + " values(#{goodname},#{price},#{pricture},#{number},#{remain},#{goodstate})")
    void add(Good good);

    @Select("select * from good where id=#{id}")
    Good findById(Integer id);
    @Delete("delete from good where id=#{id}")
    void delete(Integer id);

    @Update("update good set goodname=#{goodname},price=#{price},pricture=#{pricture},number=#{number},remain=#{remain},goodstate=#{goodstate} where id=#{id}")
    void save(Good good);
}
