package com.aadi_interview_prep.config;

import com.aadi_interview_prep.common.User;
import com.aadi_interview_prep.service.DemoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    public DemoService demoService(){
        return new DemoService();
    }

    @Bean
    public User user() {
        User user = new User();
        user.setUsername("john");
        user.setPassword("t27t"); // The original, unencrypted password
        return user;
    }

    @Bean
    public RestTemplate template(){
        return new RestTemplate();
    }
}
