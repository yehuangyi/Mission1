package com.yhy.mission1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot默认只扫描启动类所在的包及其子包的Bean，如果要扫描其它的包需要添加@ComponentScan(basePackage = "")

@SpringBootApplication
public class Mission1Application {

    public static void main(String[] args) {
        SpringApplication.run(Mission1Application.class, args);
    }

}
