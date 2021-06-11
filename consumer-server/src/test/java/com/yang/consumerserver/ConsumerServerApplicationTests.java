package com.yang.consumerserver;

import com.yang.consumerserver.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ConsumerServerApplicationTests {

    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        System.out.println("从注册中心获取：" + userService.bugTicket());
    }

}
