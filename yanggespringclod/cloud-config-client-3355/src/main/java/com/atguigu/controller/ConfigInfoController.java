package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigInfoController {
    @Value("${chen.yu.name}")
    private String love;
    @GetMapping("/chenlove")
    public String getLove(){
        return love;
    }
}
