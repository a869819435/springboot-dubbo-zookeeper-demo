package com.yang.consumerserver.service.impl;

import com.yang.providerserver.service.TicketService;
import com.yang.consumerserver.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    /**
     * 拿到注册中心的服务
     */
    @DubboReference
    TicketService ticketService;

    @Override
    public String bugTicket() {
        String ticket = ticketService.getTicket();
        return ticket;
    }
}
