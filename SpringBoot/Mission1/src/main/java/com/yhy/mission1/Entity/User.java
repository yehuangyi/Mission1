package com.yhy.mission1.Entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
  private Integer id;
  private String username;
  private String password;
  private Integer sex;
  private Integer age;
  private String email;
  private String phone;
  private Integer role;
}
