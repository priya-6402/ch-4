package com.lab;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GetterAspect {

    @Before("execution(* com.lab.*.get*(..))")
    public void beforeGetter(JoinPoint jp) {
        System.out.println("[AUDIT LOG] Intercepted query call -> " + jp.getSignature().toShortString());
    }
}
