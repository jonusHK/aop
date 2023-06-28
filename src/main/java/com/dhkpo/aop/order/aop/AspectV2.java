package com.dhkpo.aop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Slf4j
@Aspect
public class AspectV2 {

    @Pointcut("execution(* com.dhkpo.aop.order..*(..))")
    // 메서드 반환타입은 void 여야 한다.
    private void allOrder() {} // pointcut signature

    @Around("allOrder()") // com.dhopo.aop.order 패키지와 그 하위 패키지(..)를 지정하는 AspectJ 포인트컷 표현식
    public Object doLog(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("[log] {}", joinPoint.getSignature()); // join point 시그니처
        return joinPoint.proceed();
    }
}
