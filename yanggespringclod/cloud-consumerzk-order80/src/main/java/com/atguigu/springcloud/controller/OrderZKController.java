package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderZKController {
    //public static final String PAYMENT_URL = "http://localhost:8001";原来水这样的，但是都注册到zookeeper后，就可以用下面来完成调用
    public static final  String INNVOKE_PATH="http://cloud-payment-service";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "consumer/payment/zk")
    public  String payment(){
        return  restTemplate.getForObject(INNVOKE_PATH+"/payment/zk",String.class);
    }
}
