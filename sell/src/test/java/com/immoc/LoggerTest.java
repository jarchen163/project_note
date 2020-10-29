package com.immoc;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.net.spi.nameservice.dns.DNSNameService;
import sun.security.x509.DNSName;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;


//@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
    @Test
    public void test() throws Exception {
        String name = "imooc";
        String password = "123456";
        log.debug("debug...................");
        log.info("info...................");
        log.info("name:{},password:{}",name,password);





    }
}
