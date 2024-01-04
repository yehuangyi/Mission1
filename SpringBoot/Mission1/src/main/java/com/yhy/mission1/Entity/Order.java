package com.yhy.mission1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;
    private Integer user_id;
    private Integer good_id;
    private Date generation_time;
    private Integer buy_number;
    private double total_money;
}
