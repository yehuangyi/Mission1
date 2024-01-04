package com.yhy.mission1.Service;

import com.yhy.mission1.Entity.Good;


public interface GoodService {
    void addGood(Good good);

    Good findById(Integer id);

    void deleteById(Integer id);

    void save(Good good);
}
