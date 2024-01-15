package com.aadi_interview_prep.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class RestClientService {

    private OrderService orderService;

    @Autowired
    @Lazy
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
}
