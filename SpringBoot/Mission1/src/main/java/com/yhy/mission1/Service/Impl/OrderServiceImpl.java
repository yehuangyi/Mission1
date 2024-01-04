package com.yhy.mission1.Service.Impl;

import com.yhy.mission1.Entity.Order;
import com.yhy.mission1.Mapper.OrderMapper;
import com.yhy.mission1.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public void addOrder(Order order) {
        orderMapper.add(order);
    }

    @Override
    public Order findById(Integer id) {
        return orderMapper.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        orderMapper.deleteById(id);
    }

    @Override
    public void save(Order order) {
        orderMapper.save(order);
    }

    @Override
    public ArrayList<Order> findByUserId(Integer userId) {
        return orderMapper.findByUserId(userId);
    }
}
