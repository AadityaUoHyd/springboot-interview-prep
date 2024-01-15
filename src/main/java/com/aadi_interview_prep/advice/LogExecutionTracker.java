package com.aadi_interview_prep.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogExecutionTracker {

    @Around("@annotation(com.aadi_interview_prep.advice.annotation.TrackExecutionTime)")
    public Object logExecutionDuration(ProceedingJoinPoint pjp) throws Throwable {
        //before advice
        long startTime = System.currentTimeMillis();
        Object obj = pjp.proceed();
        //after advice
        long endTime = System.currentTimeMillis();
        log.info(" method {} execution takes {} ms times to complete ", pjp.getSignature(), (endTime - startTime));
        return obj;
    }

}

