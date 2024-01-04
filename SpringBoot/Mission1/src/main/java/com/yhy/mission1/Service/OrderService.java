package com.yhy.mission1.Service;

import com.yhy.mission1.Entity.Order;

import java.util.ArrayList;

public interface OrderService {
    void addOrder(Order order);

    Order findById(Integer id);

    void deleteById(Integer id);

    void save(Order order);

    ArrayList<Order> findByUserId(Integer userId);
}
