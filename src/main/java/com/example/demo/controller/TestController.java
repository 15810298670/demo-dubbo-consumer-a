package com.example.demo.controller;

import com.example.dubbo.api.TestApi;
import com.example.dubbo.entity.TestMybatis;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * create on 2020/4/21 19:05 by jc
 **/
@RestController
public class TestController {

    @Autowired
    private TestApi testApi;

    @RequestMapping("test")
    public void test(){
        List<TestMybatis> list = testApi.list();
        System.out.println(list);
    }

    @RequestMapping("update")
    public void update(){
        boolean result = testApi.update();
        System.out.println(result);
    }

}