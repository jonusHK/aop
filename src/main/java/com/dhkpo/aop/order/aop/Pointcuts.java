package com.dhkpo.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* com.dhkpo.aop.order..*(..))")
    // 메서드 반환타입은 void 여야 한다.
    public void allOrder() {} // pointcut signature

    // 클래스 이름 패턴이 *Service
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService() {}

    // allOrder && allService 조합
    @Pointcut("allOrder() && allService()")
    public void orderAndService() {}

}
