package com.mars.template_annotation.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {
    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    @Around("@annotation(com.mars.template_annotation.annotation.Loggable)")
    public Object trackTime(ProceedingJoinPoint pjp) throws Throwable {
        long stratTime=System.currentTimeMillis();
        Object obj=pjp.proceed();
        long endTime=System.currentTimeMillis();
        System.out.println("Method name"+pjp.getSignature()+" time taken to execute : "+(endTime-stratTime));
        return obj;
    }
}