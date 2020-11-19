package com.atguigu.controller;

import com.atguigu.service.impl.MessageProviderImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StreamMQTestController {
    @Resource
    private MessageProviderImpl messageProviderImpl;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        return messageProviderImpl.send();
    }
}
