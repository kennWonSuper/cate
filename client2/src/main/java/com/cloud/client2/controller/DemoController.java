package com.cloud.client2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {


    @RequestMapping(value = "/list")
    public Map<String, String> getList() {

        Map<String, String> map = new HashMap<>();
        map.put("test3", "test33");
        map.put("test4", "test44");

        return map;
    }

}
