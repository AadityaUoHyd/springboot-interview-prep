package com.aadi_interview_prep.di;

public class OrderInstanceFactory {

    public static OrderRepository getInstance() {
        return new OrderRepositoryImpl1();
    }
}
