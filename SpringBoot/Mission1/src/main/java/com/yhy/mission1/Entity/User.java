package com.yhy.mission1.Entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

  private Integer id;
  private String username;
  private String password;
  private Date number;
  private Integer sex;
  private String age;
  private String email;
  private String phone;
  private Integer role;
  private Integer status;



}
