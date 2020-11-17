package com.atguigu.hystrix.feignservice.imple;

import com.atguigu.hystrix.feignservice.IFeignServiceTest;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceTestImpl  implements IFeignServiceTest {
    @Override
    public String getTimeoutTestId(Integer id) {
        return null;
    }

    @Override
    public String getTestDefaultProperties1() {
        return "1客户端凉凉了";
    }

    @Override
    public String getTestDefaultProperties2() {
        return "2客户端凉凉了";
    }
}
