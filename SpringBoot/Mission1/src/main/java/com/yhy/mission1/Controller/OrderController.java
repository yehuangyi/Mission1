package com.yhy.mission1.Controller;

import com.yhy.mission1.Entity.Order;
import com.yhy.mission1.Entity.Result;
import com.yhy.mission1.Service.GoodService;
import com.yhy.mission1.Service.OrderService;
import com.yhy.mission1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public Result addOrder(Order order){//前端可以不用传订单生成时间
        if (order != null){
            order.setGeneration_time(new Date());
            orderService.addOrder(order);
            return new Result(1,"生成订单成功！",order);
        }else {
            return new Result(0,"生成订单失败",order);
        }
    }

    @DeleteMapping("/delete")
    public Result deleteOrder(Integer id){
        Order g = orderService.findById(id);
        if (g == null){
            return new Result(0,"该订单不存在！",null);
        }else {
            orderService.deleteById(id);
            return new Result(1,"订单删除成功！",null);
        }
    }

//    @PutMapping("/updata")
//    public Result updataOrder(Order order){
//        Order g = orderService.findById(order.getId());
//        g.setGeneration_time(new Date());
//        System.out.println(g);
//        if (g == null){
//            return new Result(0,"该订单不存在！",null);
//        }else {
//            orderService.save(order);
//            return new Result(1,"修改成功！",null);
//        }
//    }

    @GetMapping("/findByUserId")
    public Result findByUserId(Integer userId){
        ArrayList<Order> orders = orderService.findByUserId(userId);
        if (orders == null){
            return new Result(0,"该用户还未生成订单不存在！",orders);
        }else {
            return new Result(1,"找到该用户的所有订单！",orders);

        }
    }

}
