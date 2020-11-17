package com.atguigu.springcloudfign.service;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cloud-payment-service")
public interface PaymentFignService {
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) ;
    @GetMapping(value = "/payment/timeOutget/{id}")
    public CommonResult getTimeOutPaymentById(@PathVariable("id") Long id);
}
