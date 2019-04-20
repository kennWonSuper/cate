package com.cloud.client1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {


    @RequestMapping(value = "/list")
    public Map<String, String> getList() {

        Map<String, String> map = new HashMap<>();
        map.put("test1", "test11");
        map.put("test2", "test22");

        return map;
    }

}
