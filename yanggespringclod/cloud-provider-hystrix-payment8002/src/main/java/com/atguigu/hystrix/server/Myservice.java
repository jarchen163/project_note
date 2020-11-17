package com.atguigu.hystrix.server;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@DefaultProperties(defaultFallback = "getTimeoutHistrixTestId")
public class Myservice {
    public String getTestId(Integer id){
        return  "没有延迟的正常方法   id="+id;
    }

    @HystrixCommand(fallbackMethod = "getTimeoutHistrixTestId",commandProperties={
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String getTimeoutTestId(Integer id){
        try {
          //  int i = 1/0;//有异常，导致服务不能访问
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  "延迟的正常方法   id="+id;
    }
    public String getTimeoutHistrixTestId(){
        return  "你完蛋了   服务器不给你玩了";
    }
    @HystrixCommand
    public String getTestDefaultProperties1(){
        return "TestDefaultProperties  标了 @HystrixCommand";
    }

    public String getTestDefaultProperties2(){
        return "TestDefaultProperties  没标 @HystrixCommand";
    }

    //服务器熔断测试
    @HystrixCommand(fallbackMethod = "errorCircuitBreker",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), // 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"), //请求次数,熔断器将从关闭状态变为打开
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), // 时间窗口期/时间范围
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60") // 失败率达到多少后跳匝
    })//降级处理，熔断的配置    10seconds内访问请求10次   错误率是60%   开启熔断  默认5second进入半开状态
    public String getCircuitBreaker(Integer id){
        if(id > 0){
            return "id>0，这是正常值";
        }else{
            throw new RuntimeException("服务器8001凉凉了........");
        }
    }

    public  String errorCircuitBreker(Integer id){
        return  "熔断测试的兜底方法........";
    }
}
