package com.aadi_interview_prep.di;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl1 implements OrderRepository {
    @Override
    public void saveOrder() {
        System.out.println("OrderRepositoryImpl1::saveOrder() method executed..");
    }
}
