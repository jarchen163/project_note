package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;//获得eureka注册的服务信息

    @Value("${server.port}")
    private String serverPort;//读取yml中的port端口号

    @PostMapping("/payment/create")
    public CommonResult creat(@RequestBody  Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果"+result);
        if(result > 0){
            return new CommonResult(200,"插入成功，serverPort"+serverPort,result);
        }else {
            return  new CommonResult(444,"插入失败serverPort"+serverPort,null);
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {

        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功serverPort"+serverPort, payment);
        } else {
            return new CommonResult(440, "查询失败serverPort"+serverPort+"id=" + id, null);
        }

    }

    /**
     * 进行openfeign的超时控制
     * @return
     */
    @GetMapping(value = "/payment/timeOutget/{id}")
    public CommonResult getTimeOutPaymentById(@PathVariable("id") Long id) {

        Payment payment = paymentService.getPaymentById(id);
        try {//模拟超时3秒
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("查询结果" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功serverPort"+serverPort, payment);
        } else {
            return new CommonResult(440, "查询失败serverPort"+serverPort+"id=" + id, null);
        }

    }

    @GetMapping(value = "/payment/discover")
    public Object discover(){
        //获取eureka注册的服务列表的信息
        List<String> services = discoveryClient.getServices();
        for (String element : services){
            log.info("element***"+element);
        }
        //      进一步获得服务方的信息
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
        for (ServiceInstance instance:instances){
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getUri());
        }
        return this.discoveryClient;

    }
}
