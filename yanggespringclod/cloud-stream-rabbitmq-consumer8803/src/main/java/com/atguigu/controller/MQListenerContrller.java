package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;


@Component
@EnableBinding(Sink.class)
public class MQListenerContrller {
    @Value("${server.port}")
    private  String serPort;
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("消费者2号，----->接收到的消息："+ message.getPayload() +"\t port:" + serPort);
    }
}
