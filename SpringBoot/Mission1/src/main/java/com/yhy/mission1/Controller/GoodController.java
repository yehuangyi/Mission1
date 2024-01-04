package com.yhy.mission1.Controller;

import com.yhy.mission1.Entity.Good;
import com.yhy.mission1.Entity.Result;
import com.yhy.mission1.Service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/good")
public class GoodController {
    @Autowired
    private GoodService goodService;

    @PostMapping("/add")
    public Result addGood(Good good){
        if (good != null){
            goodService.addGood(good);
            return new Result(1,"添加商品成功！",good);
        }else {
            return new Result(0,"添加商品失败",null);
        }
    }

    @DeleteMapping("/delete")
    public Result deleteGood(Integer id){
        Good g = goodService.findById(id);
        if (g == null){
            return new Result(0,"该商品不存在！",null);
        }else {
            goodService.deleteById(id);
            return new Result(1,"删除成功！",null);
        }
    }

    @PutMapping("/updata")
    public Result updataGood(Good good){
        System.out.println(good);
        Good g = goodService.findById(good.getId());
        System.out.println(g);
        if (g == null){
            return new Result(0,"该商品不存在！",null);
        }else {
            goodService.save(good);
            return new Result(1,"修改成功！",null);
        }
    }


}
