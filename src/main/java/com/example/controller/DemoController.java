package com.example.controller;

import com.example.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DemoController {

    @RequestMapping("/hello")
    public Result demoTest(){
        int i = 1;
        if(i == 1) {
            throw new RuntimeException("编号已经存在");
        }
        return Result.ok();
    }
}
