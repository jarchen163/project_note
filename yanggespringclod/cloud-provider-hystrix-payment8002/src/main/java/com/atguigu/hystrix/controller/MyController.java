package com.atguigu.hystrix.controller;

import com.atguigu.hystrix.server.Myservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MyController {
    @Resource
    Myservice myservice;
    @GetMapping("/payment/hystrix/get/{id}")
    public String getTestId(@PathVariable("id") Integer id){
        return  myservice.getTestId(id);
    }
    @GetMapping("/payment/hystrix/gettimeout/{id}")
    public String getTimeoutTestId(@PathVariable("id") Integer id){
        return  myservice.getTimeoutTestId(id);
    }
    @GetMapping("/payment/hystrix/getTestDefaultProperties1")
    public String getTestDefaultProperties1(){
        int i= 1/0;
        return  myservice.getTestDefaultProperties1();
    }
    @GetMapping("/payment/hystrix/getTestDefaultProperties2")
    public String getTestDefaultProperties2(){
        return  myservice.getTestDefaultProperties2();
    }

    //熔断测试
    @GetMapping("/payment/hystrix/circuitBreaker/{id}")
    public String getCircuitBreaker(@PathVariable("id") Integer id){
        return  myservice.getCircuitBreaker(id);
    }

}
