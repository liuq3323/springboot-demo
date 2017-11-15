package com.example.controller;

import com.example.util.ResultNew;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController()
public class DemoController {

    @RequestMapping("/hello")
    public ResultNew demoTest(){
        Map map = new HashMap();
        map.put("name","11111");
        map.put("age","22222");
        return ResultNew.ok(map);
    }

    @RequestMapping("/test2")
    public ResultNew demoTest2(){
        List<String> list = new ArrayList<>();
        list.add("1111111111111");
        list.add("2222222222222");
        return ResultNew.error(list);
    }

    @RequestMapping("/test3")
    public ResultNew demoTest3(){
        List<String> list = new ArrayList<>();
        list.add("1111111111111");
        list.add("2222222222222");
        return ResultNew.error(list,"888888","error 3");
    }

    @RequestMapping("/test4")
    public ResultNew demoTest4(){
        List<String> list = new ArrayList<>();
        list.add("1111111111111");
        list.add("2222222222222");
        return ResultNew.error(list,"error 4");
    }
}
