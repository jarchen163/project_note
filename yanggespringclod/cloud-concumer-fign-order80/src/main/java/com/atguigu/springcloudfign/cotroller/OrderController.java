package com.atguigu.springcloudfign.cotroller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloudfign.service.PaymentFignService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {
    @Resource
    private PaymentFignService paymentFignService;
    @GetMapping("/consumer/payment/feign/{id}")
    public CommonResult<Payment> getEntity(@PathVariable("id") Long id){
       return  paymentFignService.getPaymentById(id);
    }

    @GetMapping(value = "/payment/timeOutget/{id}")
    public CommonResult getTimeOutPaymentById(@PathVariable("id") Long id){
        return  paymentFignService.getTimeOutPaymentById(id);
    }
}
