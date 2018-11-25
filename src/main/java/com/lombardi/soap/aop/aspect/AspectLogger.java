package com.lombardi.soap.aop.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
@EnableAspectJAutoProxy
public class AspectLogger {

    private static final Logger logger = LogManager.getLogger(AspectLogger.class);

    @Pointcut("execution(* com.lombardi.soap.aop.service..*(..))")
    protected void soapLogger() {
    }


    @Before("soapLogger()")
    public void soapLogBefore(JoinPoint joinPoint) {
        logger.info("**************");
        logger.info(joinPoint.getSignature().getName() + " entered");
    }


    @Before("execution(* com.lombardi.soap.aop.impl..*getComputerPartsByType(..))")
    public void soapLogType(JoinPoint joinPoint){
        logger.info("Passed argument :"+joinPoint.getArgs()[0]);
    }


    @After("soapLogger()")
    public void soapLogAfter(JoinPoint joinPoint) {
        logger.info(joinPoint.getSignature().getName() + " finished");
    }


    @AfterReturning(
            pointcut = "execution(* com.lombardi.soap.aop.service..*(..))",
            returning = "result")
    public void soapAfterReturning(JoinPoint joinPoint, Object result) {
        logger.info("**************");
    }


    @Around("execution(* com.lombardi.soap.aop.service..*.*(..))")
    public Object soapLogTimeMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object retVal = joinPoint.proceed();
        stopWatch.stop();
        logger.info(joinPoint.getSignature().getName() + " execution time: " + stopWatch.getTotalTimeMillis() + " ms");
        return retVal;
    }

}
