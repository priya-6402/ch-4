package com.lab;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @AfterThrowing(pointcut = "execution(* com.lab.BankService.withdraw(..))", throwing = "ex")
    public void logException(IllegalArgumentException ex) {
        System.err.println("[AOP AUDIT EXCEPTION] " + ex.getMessage());
    }
}
