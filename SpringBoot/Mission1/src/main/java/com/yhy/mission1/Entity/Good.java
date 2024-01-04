package com.yhy.mission1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Good {
    private Integer id;
    private Integer number;
    private Integer remain;
    private Integer goodstate;
    private double price;
    private String goodname;
    private String pricture;
}
