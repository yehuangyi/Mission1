package com.yhy.mission1.Controller;

import com.yhy.mission1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(String username,String password){
        //查询用户
        User u=userService.findByUsername(username);
        if(u==null){
            //没有占用
            //注册
            userService.register(username,password);
            return "成功";
        }else {
            //已经占用
            return "失败";
        }
        //注册

    }


    @PostMapping("/Login")
    public String login(String username,String password){
        //根据用户名查询
        User loginUser=userService.findByUsername(username);
        //判定该用户是否存在
        if(loginUser==null){
            return "失败"; } //用户名错误
        //判定密码是否正确
        if(password.equals(loginUser.getPassword())){
            return "成功";
        }else {
            return "失败";//密码错误
        }
    }

}
