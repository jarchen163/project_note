package com.immoc.sell;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SellApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellApplication.class, args);
        String name = "imooc";
        String password = "123456";
        log.debug("debug...................");
        log.info("info...................");
        log.info("name:{},password:{}",name,password);
        log.error("chenyulongerror");
    }

}
