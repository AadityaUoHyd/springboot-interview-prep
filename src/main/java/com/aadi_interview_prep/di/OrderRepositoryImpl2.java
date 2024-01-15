package com.aadi_interview_prep.di;

import org.springframework.stereotype.Component;

@Component
public class OrderRepositoryImpl2 implements OrderRepository{
    @Override
    public void saveOrder() {
        System.out.println("OrderRepositoryImpl2::saveOrder() method executed..");
    }
}
