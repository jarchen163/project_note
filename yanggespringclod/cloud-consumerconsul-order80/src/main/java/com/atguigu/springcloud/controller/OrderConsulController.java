package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderConsulController {
    private static final  String INNOVKE_URL = "http://consul-provider-payment";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping(value = "/consumer/consul")
    public  String getConsul(){
        return  restTemplate.getForObject(INNOVKE_URL+"/payment/consul",String.class);
    }
}
