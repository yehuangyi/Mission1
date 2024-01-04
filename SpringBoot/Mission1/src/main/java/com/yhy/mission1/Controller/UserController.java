package com.yhy.mission1.Controller;

import com.yhy.mission1.Entity.Result;
import com.yhy.mission1.Entity.User;
import com.yhy.mission1.Service.UserService;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(User user){
        //查询用户
        User u=userService.findByUsername(user.getUsername());
        if(u==null){
            //没有占用
            //注册
            userService.register(user.getUsername(),user.getPassword());
            return new Result(1,"注册成功！",user);
        }else {
            //已经占用
            return new Result(0,"注册失败！用户名已经存在",null);
        }
        //注册

    }


    @PostMapping("/login")
    public Result login(User user){
        //根据用户名查询
        User loginUser=userService.findByUsername(user.getUsername());
        //判定该用户是否存在
        if(loginUser==null){
            return new Result(0,"用户名不存在！",null); } //用户名错误
        //判定密码是否正确
        if(user.getPassword().equals(loginUser.getPassword())){
            return new Result(1,"登录成功！",loginUser);
        }else {
            return new Result(0,"密码错误" ,null);//密码错误
        }
    }

    @GetMapping("/findByUsername")
    public Result findByUsername(String username){
        User u=userService.findByUsername(username);
        if(u==null){
            return new Result(0,"用户不存在！",null);
        }else {
            return new Result(1,"成功找到该用户！",u);
        }
    }

    @GetMapping("/findAll")
    public Result findAll(){
        ArrayList<User> users = userService.findALl();
        if (users.size() == 0){
            return new Result(0,"数据库中没有数据！",null);
        }else{
            return new Result(0,"成功！",users);
        }
    }

    @DeleteMapping("/delete")
    public Result deleteByUsername(String username){
        User u=userService.findByUsername(username);
        if(u==null){
            return new Result(0,"用户不存在！",null);
        }else {
            userService.deleteById(u.getId());
            return new Result(1,"成功删除该用户！",null);
        }
    }

    @PutMapping("update")
    public Result updateByUsername(User user){
        User u = userService.findByUsername(user.getUsername());
        if(u==null){
            return new Result(0,"用户不存在！",null);
        }else {
            user.setId(u.getId());
            userService.save(user);
            return new Result(1,"成功修改该用户！",null);
        }
    }
}
