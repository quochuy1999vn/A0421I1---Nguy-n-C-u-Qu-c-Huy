package com.library.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogBook {

    // Aspect -> Advice -> pointcut -> joinPoint
    @AfterReturning(pointcut = "execution(public * com.library.service.BookService.*(..)))")
    public void logBookService(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.err.println("Class là: " + className + "và method là: " + methodName);
    }

    @AfterThrowing( value = "execution(public * com.library.service.BookService.*(..)))"
            , throwing = "e")
    public void logException(JoinPoint joinPoint, Exception e){
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.err.println("Class là: " + className + " Và medthod là: " + methodName + " " + e.getMessage());
    }

}
