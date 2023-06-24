package com.mars.template_annotation.aspect;

import com.mars.template_annotation.annotation.LengthCheck;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Aspect
@Component
public class LengthCheckingAspect {

//    @Around("@annotation(com.mars.template_annotation.annotation.LengthCheck)")
//    public Object trackTime(ProceedingJoinPoint pjp) throws Throwable {
//        long stratTime=System.currentTimeMillis();
//        Object obj=pjp.proceed();
//        long endTime=System.currentTimeMillis();
//        System.out.println("Method name"+pjp.getSignature()+" time taken to execute : "+(endTime-stratTime));
//        return obj;
//    }

    @Around("@annotation(lengthCheck)")
    public Object checkLength(ProceedingJoinPoint joinPoint, LengthCheck lengthCheck) throws Throwable {
        System.out.println("Test");
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg != null && arg instanceof String && ((String) arg).length() > lengthCheck.maxLength()) {
                throw new IllegalArgumentException("Field length exceeds maximum allowed length of " + lengthCheck.maxLength());
            }
        }
        return joinPoint.proceed();
    }
}