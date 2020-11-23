package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.port}")
    private String servicePort;

    @GetMapping("/testnacos")
    public String getServicePort(){
        return  "正在启动的是......"+servicePort;
    }
}
