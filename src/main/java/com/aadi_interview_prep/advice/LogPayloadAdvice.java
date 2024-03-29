package com.aadi_interview_prep.advice;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogPayloadAdvice {

    @Around("@annotation(com.aadi_interview_prep.advice.annotation.LogPayloads)")
    public Object logPayloads(ProceedingJoinPoint pjp) throws Throwable {
        //before advice
        log.info("Request Body {} ", new ObjectMapper().writeValueAsString(pjp.getArgs()));
        Object obj = pjp.proceed();
        //after advice
        log.info("Response Body {} ", new ObjectMapper().writeValueAsString(pjp.getArgs()));
        return obj;
    }
}
