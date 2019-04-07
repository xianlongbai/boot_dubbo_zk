package com.bxl.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bxl.service.DubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;



/**
 * Created by root on 2018/9/15.
 */
@RestController
@RequestMapping("/dubbo")
public class DubboController {

    //通过该注解，订阅该接口版本为 1.0.0 的 Dubbo 服务
    @Reference(version = "1.0.0")
    DubboService dubboService;

    @RequestMapping("sayHello")
    public void sayHello() {
        System.out.println("dubbo开始调用");
        String res = dubboService.sayHello("服务器,你好！！！");
        System.out.println("服务返回值："+res);
    }

}
