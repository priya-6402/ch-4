package com.lab;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimingAspect {

    @Around("execution(* com.lab.BankService.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object res = pjp.proceed();
        long duration = System.currentTimeMillis() - start;
        System.out.println("[PROFILER] Method '" + pjp.getSignature().getName() + "' executed in " + duration + " ms");
        return res;
    }
}
