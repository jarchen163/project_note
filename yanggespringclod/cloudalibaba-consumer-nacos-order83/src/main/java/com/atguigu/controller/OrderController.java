package com.atguigu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
    @Value("${service-url.nacos-user-service}")
    private   String PATH;
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("consumer/testnacos")
    public  String getTestnacos(){
        log.info(PATH);
        return restTemplate.getForObject(PATH+"/testnacos",String.class);
    }
}
