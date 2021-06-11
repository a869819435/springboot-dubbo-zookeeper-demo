package com.yang.providerserver.service.impl;

import com.yang.providerserver.service.TicketService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@DubboService(interfaceClass = TicketService.class)
@Component
public class TicketServiceImpl implements TicketService {
    public String getTicket() {
        return "a ticket";
    }
}
