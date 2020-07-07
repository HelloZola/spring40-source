package example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import utils.PrintContolUtils;

@Aspect
@Component
public class TransactionDemo {

    @Pointcut("execution(* example.aspect.UserServiceImpl.addUser(..))")
    private void pointCutMethod() {

    }

    // 前置通知
    @Before("pointCutMethod()")
    public void startTransaction() {
        PrintContolUtils.print(PrintContolUtils.Aop, "前置通知 begin ");
    }

    // 后置通知
    @AfterReturning(pointcut = "pointCutMethod()")
    public void commitTransaction() {
        PrintContolUtils.print(PrintContolUtils.Aop, "前置通知 end ");
    }

    // 环绕通知
    @Around("pointCutMethod()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        PrintContolUtils.print(PrintContolUtils.Aop, "环绕通知 begin");
        joinPoint.proceed();
        PrintContolUtils.print(PrintContolUtils.Aop, "环绕通知 end");
    }
}
