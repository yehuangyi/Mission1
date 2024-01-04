package com.yhy.mission1.Service.Impl;

import com.yhy.mission1.Entity.Good;
import com.yhy.mission1.Mapper.GoodMapper;
import com.yhy.mission1.Service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    private GoodMapper goodMapper;
    @Override
    public void addGood(Good good) {
        goodMapper.add(good);
    }

    @Override
    public Good findById(Integer id) {
        return goodMapper.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        goodMapper.delete(id);
    }

    @Override
    public void save(Good good) {
        goodMapper.save(good);
    }
}
