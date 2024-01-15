package com.aadi_interview_prep.di;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrailerService {

    @Autowired
    //@Qualifier("orderRepositoryImpl2")//byType
    @Resource(name = "orderRepositoryImpl1")//byName
    private OrderRepository orderRepository;
}
