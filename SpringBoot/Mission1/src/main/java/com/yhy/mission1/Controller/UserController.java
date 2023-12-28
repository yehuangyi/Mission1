package com.yhy.mission1.Controller;

import com.yhy.mission1.Entity.Result;
import com.yhy.mission1.Entity.User;
import com.yhy.mission1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public Result register(String username, String password){
        //查询用户
        User u=userService.findByUsername(username);
        if(u==null){
            //没有占用
            //注册
            u = new User();
            u.setUsername(username);
            u.setPassword(password);
            userService.register(u.getUsername(),u.getPassword());
            return new Result(1,"注册成功！",u);
        }else {
            //已经占用
            return new Result(1,"注册失败！用户名已经存在",null);
        }
        //注册

    }


    @PostMapping("/login")
    public Result login(String username, String password){
        //根据用户名查询
        User loginUser=userService.findByUsername(username);
        //判定该用户是否存在
        if(loginUser==null){
            return new Result(0,"用户名错误！",null); } //用户名错误
        //判定密码是否正确
        if(password.equals(loginUser.getPassword())){
            return new Result(1,"登录成功！",loginUser);
        }else {
            return new Result(0,"密码错误" ,null);//密码错误
        }
    }

}
