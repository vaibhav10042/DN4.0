package com.Library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
    @Around("execution(* com.Library.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint)throws Throwable{
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long timetaken = System.currentTimeMillis() - start;
        System.out.println("Method {"+joinPoint.getSignature()+"} executed in "+timetaken+"ms");
        return result;
    }
}
