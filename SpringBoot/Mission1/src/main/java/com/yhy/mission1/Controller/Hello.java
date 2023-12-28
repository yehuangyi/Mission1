package com.yhy.mission1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/he")
    public String hello(){
        return "hello word~~~~";
    }
}
