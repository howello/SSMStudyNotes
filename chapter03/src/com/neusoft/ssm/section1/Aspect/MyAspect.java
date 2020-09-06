package com.neusoft.ssm.section1.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类
 */
public class MyAspect {
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("前置通知，模拟执行权限检查···");
        System.out.println("目标类是：" + joinPoint.getTarget());
        System.out.println("被植入增强处理的目标方法为：" + joinPoint.getSignature().getName());
    }

    public void myAfterReturning(JoinPoint joinPoint) {
        System.out.println("后置通知：模拟记录日志···");
        System.out.println("被植入增强处理的目标方法为：" + joinPoint.getSignature().getName());
    }

    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕开始：执行任务之前，模拟开启事务···");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("环绕结束：执行任务之后，模拟关闭事务···");
        return obj;
    }

    public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("异常通知：出错啦！" + e.getMessage());
    }

    public void myAfter() {
        System.out.println("最终通知：模拟方法结束后释放资源···");
    }
}
