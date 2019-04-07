package com.bxl.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by root on 2018/9/15.
 */
@RestController
@RequestMapping("/app")
public class Test {


    @RequestMapping("/hello")
    public String hello(){
        return "hello word";
    }

}
