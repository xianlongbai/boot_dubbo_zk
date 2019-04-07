package com.bxl.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bxl.service.DubboService;

/**
 * Created by root on 2018/9/15.
 */

//@Service 注解标识为 Dubbo 服务，并通过 version 指定了版本号。
@Service(version = "1.0.0")
public class DubboServiceImpl implements DubboService {

    @Override
    public String sayHello(String name) {
        System.out.println("接受到客户端消息："+name);
        return "你好,客户端！！！";
    }

}
