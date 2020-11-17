package com.atguigu.hystrix.controller;

import com.atguigu.hystrix.feignservice.IFeignServiceTest;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HystrixControllerTest {
    @Resource
    private IFeignServiceTest iFeignServiceTest;
    @GetMapping("/consumer/hystrix/gettimeout/{id}")
    public String getTimeoutTestId(@PathVariable("id") Integer id) {
        return iFeignServiceTest.getTimeoutTestId(id);
    }
    @GetMapping("/consumer/hystrix/getTestDefaultProperties1")
    public String getTestDefaultProperties1() {

        return  iFeignServiceTest.getTestDefaultProperties1();
    }
    @GetMapping("/consumer/hystrix/getTestDefaultProperties2")
    public String getTestDefaultProperties2() {
        return  iFeignServiceTest.getTestDefaultProperties2();
    }

}
