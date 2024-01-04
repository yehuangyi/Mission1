package com.yhy.mission1.Service;

import com.yhy.mission1.Entity.Good;

import java.util.ArrayList;


public interface GoodService {
    void addGood(Good good);

    Good findById(Integer id);

    void deleteById(Integer id);

    void save(Good good);

    ArrayList<Good> findByGoodName(String goodName);

    ArrayList<Good> findAll();
}
