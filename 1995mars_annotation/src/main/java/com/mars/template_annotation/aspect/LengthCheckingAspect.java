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
public class LengthCheckingAspect {

    @Around("@annotation(com.mars.template_annotation.annotation.LengthCheck)")
    public void checkLength() {

            System.out.println("Executing myAdvice!!");
    }
}