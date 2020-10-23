package com.itheima.health.contorller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.health.entity.Result;
import com.itheima.health.pojo.CheckItem;
import com.itheima.health.service.CheckItemService;
import com.itheima.health.constant;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//表示返回的是json格式
@RestController
@RequestMapping("/checkitem")
public class CheckItemController {
//    去订阅服务
    @Reference
    private CheckItemService checkItemService;
    @GetMapping("/findAll")
    public Result findAll(){
        List<CheckItem> list=checkItemService.findAll();
        return new Result(true, constant.MessageConstant.QUERY_CHECKGROUP_SUCCESS,list);
    }
    @PostMapping("/add")
    public Result add(@RequestBody CheckItem checkItem){
        checkItemService.add(checkItem);
        return new Result(true,constant.MessageConstant.ADD_CHECKGROUP_SUCCESS);
    }
}
