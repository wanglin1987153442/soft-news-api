package com.soft1851.api.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName: asdas
 * @Description: TODO
 * @Author: WangLinLIN
 * @Date: 2020/11/17 19:23:34 
 * @Version: V1.0
 **/
@Aspect
@Component
public class ServiceLogAspect {
    final static Logger logger = LoggerFactory.getLogger(ServiceLogAspect.class);
    /**
     * AOP通知：前置通知，后置通知，环绕通知，异常通知，最终通知
     */
    @Around("execution(* com.soft1851.*.service.impl..*.*(..))")
    public Object recordTimeDfService(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("==== 开始执行 {}.{} ====",joinPoint.getTarget().getClass(),joinPoint.getSignature().getName());
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        long takeTime = end - start;
        if (takeTime > 3000) {
            logger.error("当前执行耗时: {}",takeTime);
        }else if (takeTime > 2000) {
            logger.warn("当前执行耗时：{}",takeTime);
        }else {
            logger.info("当前执行耗时：{}",takeTime);
        }
        return result;
    }
}

