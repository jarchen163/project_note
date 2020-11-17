package com.atguigu.springcloudfign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderFignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFignMain80.class,args);
    }
}
