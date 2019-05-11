package com.kodilla.patterns2.aop.calculator;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

@Aspect
@Component
public class Watcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(Watcher.class);
/*
    @Before("execution(* com.kodilla.patterns2.aop.calculator.Calculator.factorial(..))" +
    "&& args(theNumber) && target(object)")
    public void logEvent() {
        LOGGER.info("Class" + object.getClass().getName + ", Args " + theNumber);
    }

    @Around("execution(* com.kodilla.patterns2.aop.calculator.Calculator.factorial(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time consumed: " + (end - begin) + "[ms]");
        } catch(Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
    */
}
