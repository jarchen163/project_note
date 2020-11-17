package com.atguigu.hystrix.feignservice;


import com.atguigu.hystrix.feignservice.imple.FeignServiceTestImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "cloud-provider-hystrix-payment",fallback = FeignServiceTestImpl.class)
public interface IFeignServiceTest {
    @GetMapping("/payment/hystrix/gettimeout/{id}")
    public String getTimeoutTestId(@PathVariable("id") Integer id);
    @GetMapping("/payment/hystrix/getTestDefaultProperties1")
    public String getTestDefaultProperties1();
    @GetMapping("/payment/hystrix/getTestDefaultProperties2")
    public String getTestDefaultProperties2();
}
